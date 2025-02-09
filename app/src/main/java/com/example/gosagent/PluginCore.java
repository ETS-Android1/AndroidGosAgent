package com.example.gosagent;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.ArrayList;
import java.util.List;

public class PluginCore {
    public static ReadData DB = new ReadData();
    public static List<MarkerData> Marker = new ArrayList<>();
    public static int MarkerType = 0;
    public static List<LotInformationsData> LotInformationData = new ArrayList<>();
    public static ConfigsForDB ConfigsInformation = new ConfigsForDB();
    public static List<LotInformationsData> FavoritesLot = new ArrayList<>();

    public static int getMarkerType() {
        int icon;
        switch (MarkerType) {
            case 1: icon = R.drawable.ic_museum; break;
            case 2: icon = R.drawable.ic_city_hall; break;
            case 3: icon = R.drawable.ic_hardware_store; break;
            case 4: icon = R.drawable.ic_bakery; break;
            case 5: icon = R.drawable.ic_finance; break;
            case 6: icon = R.drawable.ic_train_station; break;
            case 7: icon = R.drawable.ic_postal_code_prefix; break;
            case 8: icon = R.drawable.ic_political; break;
            case 9: icon = R.drawable.ic_electronics_store; break;
            case 10: icon = R.drawable.ic_aquarium; break;
            case 11: icon = R.drawable.ic_fishing_pier; break;
            case 12: icon = R.drawable.ic_bank; break;
            case 13: icon = R.drawable.ic_lawyer; break;
            case 14: icon = R.drawable.ic_general_contractor; break;
            case 15: icon = R.drawable.ic_volume_control_telephone; break;
            case 16: icon = R.drawable.ic_electrician; break;
            case 17: icon = R.drawable.ic_electronics_store; break;
            default: icon = R.drawable.ic_postal_code_prefix; break;
        }
        return icon;
    }

    public static BitmapDescriptor bitmapDescriptorFromVector(Context context) {
        int vectorResId = getMarkerType();
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

    public static Drawable getIcon(Context context) {
        int vectorResId = getMarkerType();
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return  vectorDrawable;
    }

    public static String getTableName() { return ConfigsInformation.tableName + PluginCore.MarkerType; }

    public static void addLotData(int id, double coordinatesX, double coordinatesY){
        Marker.add(new MarkerData(id, coordinatesX, coordinatesY));
    }

    public static void init() {
        FavoritesLot.clear();
        Marker.clear();
        LotInformationData.clear();
        DB = new ReadData();
    }
}

