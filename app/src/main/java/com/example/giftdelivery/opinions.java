package com.example.giftdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class opinions extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ReviewAdapter reviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinions);

        recyclerView = findViewById(R.id.Rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Review> reviewList = generateFakeReviews();
        reviewAdapter = new ReviewAdapter(reviewList);
        recyclerView.setAdapter(reviewAdapter);
    }

    private List<Review> generateFakeReviews() {
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review("Mohammad Fahad ", 4.5f, "Great flowers, fast delivery! Highly recommended."));
        reviews.add(new Review(" Hessah Jamal", 5.0f, "Beautiful bouquet and excellent service."));
        reviews.add(new Review("Tariq Abdullah", 5.0f, "Their flower arrangements were stunning. "));
        reviews.add(new Review("Dallal hasan", 3.0f, "The accessories were alright, but I've seen similar items elsewhere. "));
        reviews.add(new Review("Ahmad Saleh ", 4.0f, "Good quality flowers with reasonable prices."));
        reviews.add(new Review("Fatimah Majed ", 2.5f, "The flowers were decent, but not as vibrant as I expected."));
        reviews.add(new Review("Nawaf Ahmad ", 4.0f, " The cakes were delicious but the delivery was leate."));
        reviews.add(new Review(" Sara Ali", 4.0f, "The accessories they offered were unique and added a special touch to the gifts.The delivery was prompt."));
        reviews.add(new Review("Nada Hamad", 2.5f, "Team was helpful throughout the ordering process. "));
        return reviews;
    }

    private static class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

        private List<Review> reviewList;

        public ReviewAdapter(List<Review> reviewList) {
            this.reviewList = reviewList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.opinions2, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Review review = reviewList.get(position);
            holder.customerNameTextView.setText(review.getCustomerName());
            holder.ratingBar.setRating(review.getRating());
            holder.reviewTextView.setText(review.getReviewText());
        }

        @Override
        public int getItemCount() {
            return reviewList.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {

            private TextView customerNameTextView;
            private RatingBar ratingBar;
            private TextView reviewTextView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                customerNameTextView = itemView.findViewById(R.id.customerNameTextView);
                ratingBar = itemView.findViewById(R.id.ratingBar);
                reviewTextView = itemView.findViewById(R.id.reviewTextView);
            }
        }
    }

    private static class Review {

        private String customerName;
        private float rating;
        private String reviewText;

        public Review(String customerName, float rating, String reviewText) {
            this.customerName = customerName;
            this.rating = rating;
            this.reviewText = reviewText;
        }

        public String getCustomerName() {
            return customerName;
        }

        public float getRating() {
            return rating;
        }

        public String getReviewText() {
            return reviewText;
        }
    }
}
