package br.com.fiap.movies;

public class DetailsActivity {

    <androidx.constraintlayout.widget.ConstraintLayout

    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
    android:id="@+id/movie_title"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:textSize="@dimen/text_size_large"
    android:layout_marginHorizontal="@dimen/margin_medium"
    android:layout_marginVertical="@dimen/margin_large"
    android:textStyle="bold"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />

    <TextView
    android:id="@+id/movie_synopsis"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:textSize="@dimen/text_size_medium"
    android:layout_marginHorizontal="@dimen/margin_medium"
    android:layout_marginVertical="@dimen/margin_small"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/movie_title" />

    <TextView
    android:id="@+id/movie_rating"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="@dimen/text_size_medium"
    android:layout_marginHorizontal="@dimen/margin_medium"
    android:layout_marginVertical="@dimen/margin_small"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/movie_synopsis" />


}
