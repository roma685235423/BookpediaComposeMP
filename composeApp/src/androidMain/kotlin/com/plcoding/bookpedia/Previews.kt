package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BookSearchBarPreview() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "Kotlin",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}