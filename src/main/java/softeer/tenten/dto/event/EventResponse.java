package softeer.tenten.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

public class EventResponse {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class EventList {
        private final Long id;
        private final String name;
        private final String title;
        private final String image;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class EventDetail {
        private final String name;
        private final String title;
        private final String content;
        private final String image;
        private final Integer status;
    }
}
