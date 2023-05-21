package com.example.instragram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.instragram.InstagramTemplate.Chat;
import com.example.instragram.InstagramTemplate.InstagramListviewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Declarando ListView
    ListView lstChatsIG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializando Controles
        this.InitializeControls();
        //Cargando El listView
        this.LoadListViewTemplate();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.newItem) {
            this.AgregarNuevoElemento();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    private void InitializeControls()
    {

        lstChatsIG = (ListView)findViewById(R.id.lstChatsIG);
    }

    private void LoadListViewTemplate()
    {
        List<Chat> ChatsIG = this.GetElementsToListViewTemplate();

        InstagramListviewAdapter adapter = new InstagramListviewAdapter(this , ChatsIG);

        lstChatsIG.setAdapter(adapter);
    }

    @NonNull
    private List<Chat> GetElementsToListViewTemplate()
    {
        List<Chat> ChatsIG = new ArrayList<Chat>();

        ChatsIG.add(new Chat(R.drawable.a,"Eyner Vergara", "Pasa la tarea", "12:50p.m"));
        ChatsIG.add(new Chat(R.drawable.b,"Juan Ospina", "Haganlos todos","02:20p.m"));
        ChatsIG.add(new Chat(R.drawable.c,"Peter Williams", "Usamos Listview","08:00a.m"));
        ChatsIG.add(new Chat(R.drawable.d,"Mickey Mouse", "no falten","ayer"));
        ChatsIG.add(new Chat(R.drawable.e,"Iron Man", "Lastimosamente hay que hacerlo","hace 20h"));
        ChatsIG.add(new Chat(R.drawable.f,"Kratos", "Ayudame","hace 1min"));
        ChatsIG.add(new Chat(R.drawable.g,"Samuel Diaz", "Que tal tu dia?","hace 1min"));
        ChatsIG.add(new Chat(R.drawable.h,"Mario", "Te invito","2:14 p.m"));

        return  ChatsIG;

    }

    private void AgregarNuevoElemento() {
        Chat nuevoChat = new Chat(R.drawable.i, "Luigui", "Vamo a Juga", "hace un momento");

        InstagramListviewAdapter adapter = (InstagramListviewAdapter) lstChatsIG.getAdapter();
        adapter.add(nuevoChat);
        adapter.notifyDataSetChanged();
    }

}