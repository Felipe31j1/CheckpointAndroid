package br.com.fiap.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.ui.recyclerview.adapter.MovieAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_movies)
        recyclerView.adapter = MovieAdapter(movies = )

        val movies = listOf("Shrek 2!", "The Lion King", "Toy Story")
        val adapter = MovieAdapter(movies)


    }
}




