/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataSrc.Estacion;
import Logic.DataManipulation;
import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.*;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.teamdev.jxmaps.examples.*;

/**
 *
 * @author Rubén Darío Martínez
 */
public abstract class Maps extends MapView{
    
    private Map map;

    public Maps(MapViewOptions options,Estacion origen,Estacion destino){
        super(options);
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus ms) {
                
                map = getMap();
                calculateDirection(map,origen, destino);
                putMarket(origen);
                putMarket(destino);
                
                
                map.setCenter(new LatLng(4.60971, -74.08175));
                map.setZoom(10.0);
                                
            }

            private void putMarket(Estacion estacion) {
                Marker marker = new Marker(map);
                marker.setPosition(new LatLng(estacion.getLatitude(),estacion.getLongitude()));                
                Icon icon = new Icon();
                icon.loadFromFile("src\\src_images\\TMLogo.png");
                icon.setScaledSize(new Size(30,30));                         
                marker.setIcon(icon);
                marker.setTitle(estacion.getNombre());
            }
        });
        
        JFrame frame = new JFrame();

        
        frame.add(this, BorderLayout.CENTER);
        frame.setSize(375,812);
            
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public Maps(String nName){
        JFrame jFrame = new JFrame();

      
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus ms) {
                if(ms == MapStatus.MAP_STATUS_OK){
                                       
                    map = getMap();
                    
                    
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions mapOptionsT = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(mapOptionsT);
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(4.60971, -74.08175));
                    map.setZoom(10.0);
                    
                    for(Estacion estacion: DataManipulation.listaEstacionesHM.valueSet()){
                         Marker mark = new Marker(map);
                         mark.setPosition(new LatLng(estacion.getLatitude(),estacion.getLongitude()));
                         Icon icon = new Icon();
                         icon.loadFromFile("src\\src_images\\TMLogo.png");
                         icon.setScaledSize(new Size(30,30));
                         mark.setAnimation(Animation.DROP);
                         mark.setIcon(icon);
                         InfoWindow info = new InfoWindow(map);
                         info.setContent("<h3>" + estacion.getNombre() + "</h3>" + "\n" + estacion.listaRutas());
                   
                         
                         mark.addEventListener("mouseover", new MapMouseEvent() {
                             @Override
                             public void onEvent(MouseEvent me) {
                                 info.open(map,mark);
                                 mark.addEventListener("mouseout", new MapMouseEvent() {
                                     @Override
                                     public void onEvent(MouseEvent me) {
                                          info.close();
                                     }
                                     
                                 });
                      
                             }
                         });
                         

                         
                         mark.addEventListener("click", new MapMouseEvent() {
                             @Override
                             public void onEvent(MouseEvent me) {
                                 
                             }
                         });
                         
                        
                         
                    }                                                                               
                }
            }
        });
               jFrame.add(this,BorderLayout.CENTER);
               jFrame.setSize(375,812);
               jFrame.setUndecorated(false);
               jFrame.setLocationRelativeTo(null);
               jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 27){
                    dispose();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
               jFrame.setVisible(true);
    }
    
public Maps(Estacion origen,Estacion destino){
        JFrame jFrame = new JFrame();
        
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus ms) {
                if(ms == MapStatus.MAP_STATUS_OK){
                    
                    MapViewOptions options = new MapViewOptions();
                    options.setApiKey("AIzaSyBVi1WKFDMNFu4jsmxD6WXkTYiy8r_JX-U");
                    MapView view = new MapView(options);
                    
                    
                    
                    map = getMap();
                    calculateDirection(map,origen, destino);
                    putMarket(origen);
                    putMarket(destino);
                    MapOptions mapOptions = new MapOptions();
                    
                    
                    MapTypeControlOptions mapOptionsT = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(mapOptionsT);
                    
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(4.60971, -74.08175));
                    map.setZoom(10.0);
                    
                    
                    
                    
                    
                    
                }
            }

            private void putMarket(Estacion estacion) {
                Marker marker = new Marker(map);
                marker.setPosition(new LatLng(estacion.getLatitude(),estacion.getLongitude()));                
                Icon icon = new Icon();
                icon.loadFromFile("src\\src_images\\TMLogo.png");
                icon.setScaledSize(new Size(30,30));                         
                marker.setIcon(icon);
                marker.setTitle(estacion.getNombre());
            }


        });
               jFrame.add(this,BorderLayout.CENTER);
               jFrame.setSize(375,812);
               jFrame.setLocationRelativeTo(null);
               jFrame.setVisible(true);
    }
    
    private void calculateDirection(Map map,Estacion origen,Estacion destino) {
        // Getting the associated map object
        
        // Creating a directions request
        DirectionsRequest request = new DirectionsRequest();
        // Setting of the origin location to the request
        request.setOrigin(new LatLng(origen.getLatitude(),origen.getLongitude()));
        // Setting of the destination location to the request
        request.setDestination(new LatLng(destino.getLatitude(),destino.getLongitude()));
        // Setting of the travel mode
        request.setTravelMode(TravelMode.TRANSIT);
        // Calculating the route between locations
        getServices().getDirectionService().route(request, new DirectionsRouteCallback(map) {
            @Override
            public void onRoute(DirectionsResult result, DirectionsStatus status) {
                // Checking of the operation status
                if (status == DirectionsStatus.OK) {
                    // Drawing the calculated route on the map
                    map.getDirectionsRenderer().setDirections(result);
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Route cannot be calculated.\nPlease correct input data.");
                }
            }
        });
    }
}
