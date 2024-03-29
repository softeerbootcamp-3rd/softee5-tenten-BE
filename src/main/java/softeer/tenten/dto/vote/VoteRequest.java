package softeer.tenten.dto.vote;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class VoteRequest {
    @Getter
    @Builder
    @RequiredArgsConstructor
    public static class VoteOption{
        private final String userId;
        private final Long optionId;
    }
}
