package softeer.tenten.controller.review;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import softeer.tenten.dto.review.ReviewResponse;
import softeer.tenten.global.api.ApiResponse;
import softeer.tenten.service.review.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/pop-up/{id}/reviews")
    public ResponseEntity<Object> getReviews(@PathVariable Long id) {
        List<ReviewResponse.ReviewList> reviews = reviewService.getReviewList(id);
        return ResponseEntity.ok(ApiResponse.onSuccess(reviews));
    }
}
