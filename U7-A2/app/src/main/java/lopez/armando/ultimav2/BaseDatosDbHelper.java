package lopez.armando.ultimav2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatosDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "BaseDatos.db";

    public BaseDatosDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query_crear_tablas =
                "CREATE TABLE " + lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.TABLE_NAME +
                        " (" + lopez.armando.ultimav2.BaseDatosContract.TablaUsuario._ID + " INTEGER PRIMARY KEY," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_USERNAME + " TEXT," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_PASSWORD + " TEXT," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_NOMBRE_PILA + " TEXT," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_GENERO + " TEXT," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_TECNOLOGIAS + " TEXT," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_INSTITUCION + " TEXT," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_NOTIFICACIONES + " INTEGER," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_PUBLICIDAD + " INTEGER," +
                        lopez.armando.ultimav2.BaseDatosContract.TablaUsuario.COLUMN_NAME_FECHA_NACIMIENTO + " INTEGER" +
                        " )";
        db.execSQL(query_crear_tablas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}