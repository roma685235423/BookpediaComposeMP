package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import androidx.compose.ui.tooling.preview.Preview as p
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@p
@Composable
fun BookSearchBarPreview() {
    Box(
       modifier = Modifier
           .fillMaxWidth()
           .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Philipp Lackner"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.776259,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}

@p
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResult = books
        ),
        onAction = {}
    )
}