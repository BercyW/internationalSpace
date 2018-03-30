package security.bercy.com.internationalspacestationpasses.utils;



public class GPSDeviceEvent {
    private final double latitude;
    private final double longitude;

    //    Receives the latitude and longitude values from the GPSDevice Event
    public GPSDeviceEvent(double latitude, double longitude) {
        this.latitude=latitude;
        this.longitude=longitude;
    }

    //    Method to return the latitude value received from GPSDevice.
    public double getLatitude() {
        return latitude;
    }

    //    Method to return the longitude value received from GPSDevice.
    public double getLongitude() {
        return longitude;
    }
}
