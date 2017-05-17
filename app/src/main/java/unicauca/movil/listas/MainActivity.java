package unicauca.movil.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    String[] colores, dias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        list.setOnItemClickListener(this);
        spinner.setOnItemSelectedListener(this);

        colores = getResources().getStringArray(R.array.colores);
        dias = getResources().getStringArray(R.array.dias);

     }


    //region ListView Listener
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, dias[position], Toast.LENGTH_SHORT).show();
    }
    //endregion

    //region Spinner Listener
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, colores[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    //endregion
}
