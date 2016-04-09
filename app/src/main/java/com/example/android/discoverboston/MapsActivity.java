package com.example.android.discoverboston;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private static final LatLng BOSTON = new LatLng(42.359713, -71.058614);
    private static final LatLng BOSTON_COMMON = new LatLng(42.355192, -71.065680);
    private static final LatLng MASS_STATE_HOUSE = new LatLng(42.358970, -71.063856);
    private static final LatLng PARK_STREET_CHURCH = new LatLng(42.357066, -71.061988);
    private static final LatLng GRANARY_BURYING_GROUND = new LatLng(42.357722, -71.061743);
    private static final LatLng KINGS_CHAPEL = new LatLng(42.358232, -71.059973);
    private static final LatLng KINGS_CHAPEL_BURYING_GROUND = new LatLng(42.358201, -71.060000);
    private static final LatLng BENJAMIN_FRANKLIN_STATUE = new LatLng(42.358369, -71.059356);
    private static final LatLng OLD_CORNER_BOOKSTORE = new LatLng(42.357531, -71.058373);
    private static final LatLng OLD_SOUTH_MEETING_HOUSE = new LatLng(42.356989, -71.058264);
    private static final LatLng OLD_STATE_HOUSE = new LatLng(42.358749, -71.057309);
    private static final LatLng SITE_OF_BOSTON_MASSACRE = new LatLng(42.358706, -71.057294);
    private static final LatLng FANEUIL_HALL = new LatLng(42.360022, -71.056187);
    private static final LatLng PAUL_REVERE_HOUSE = new LatLng(42.363757, -71.053654);
    private static final LatLng OLD_NORTH_CHURCH = new LatLng(42.366324, -71.054284);
    private static final LatLng COPPS_HILL_BURYING_GROUND = new LatLng(42.367165, -71.055693);
    private static final LatLng BUNKER_HILL_MONUMENT = new LatLng(42.376388, -71.060546);
    private static final LatLng USS_CONSTITUTION = new LatLng(42.373995, -71.055275);


    LatLng[] route = {BOSTON_COMMON, MASS_STATE_HOUSE, PARK_STREET_CHURCH, GRANARY_BURYING_GROUND, KINGS_CHAPEL, KINGS_CHAPEL_BURYING_GROUND, BENJAMIN_FRANKLIN_STATUE, OLD_CORNER_BOOKSTORE, OLD_SOUTH_MEETING_HOUSE, OLD_STATE_HOUSE, SITE_OF_BOSTON_MASSACRE, FANEUIL_HALL, PAUL_REVERE_HOUSE, OLD_NORTH_CHURCH, COPPS_HILL_BURYING_GROUND, BUNKER_HILL_MONUMENT, USS_CONSTITUTION};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        //addMarkers();


        //create a polyline and add all the places to it
        //add marker to every place as well
        PolylineOptions polylineOpts = new PolylineOptions();
        for(int i=0; i<route.length; i++){
            polylineOpts.add(route[i]).color(Color.BLUE).geodesic(true);
            mMap.addMarker(new MarkerOptions().position(route[i]));//.position(...).title("Marker in Sydney")
        }
        //draw polyline
        mMap.addPolyline(polylineOpts);

        //positions camera on a specific point (BOSTON in this case)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BOSTON, 15));//zoom level
    }

/**
 private void addMarkers() {
 mMap.addMarker(new MarkerOptions()
 .position(BRISBANE)
 .title("Brisbane"));

 mMap.addMarker(new MarkerOptions()
 .position(MELBOURNE)
 .title("Melbourne")
 .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

 mMap.addMarker(new MarkerOptions()
 .position(SYDNEY)
 .title("Sydney")
 .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

 mMap.addMarker(new MarkerOptions()
 .position(ADELAIDE)
 .title("Adelaide")
 .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

 mMap.addMarker(new MarkerOptions()
 .position(PERTH)
 .title("Perth")
 .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
 }
 */
}
