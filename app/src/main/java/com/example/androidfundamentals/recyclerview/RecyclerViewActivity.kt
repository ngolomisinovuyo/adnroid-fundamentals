package com.example.androidfundamentals.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfundamentals.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        var todoList = mutableListOf(
            Todo("C# Unit Testing", false),
            Todo("Android dev", false),
            Todo("Azure Devops", false),
            Todo("React", false),
            Todo("Java Spring Framework", false),
            Todo("Python Penetration testing", false),
            Todo("Redis", false),
            Todo("Docker", false),
        )
        val adapter = TodoAdapter(todoList)
        findViewById<RecyclerView>(R.id.rvTodos).adapter = adapter
        findViewById<RecyclerView>(R.id.rvTodos).layoutManager = LinearLayoutManager(this)

        findViewById<Button>(R.id.btnAddTodo).setOnClickListener {
            val title = findViewById<EditText>(R.id.etNewTodo).text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }

    }
}