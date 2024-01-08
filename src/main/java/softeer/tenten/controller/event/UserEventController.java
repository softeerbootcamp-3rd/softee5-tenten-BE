package softeer.tenten.controller.event;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import softeer.tenten.dto.event.EventRequest;
import softeer.tenten.global.api.ApiResponse;
import softeer.tenten.service.event.UserEventService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserEventController {

    private final UserEventService userEventService;

    @PostMapping("/pop-up/{id}/events/{eventId}")
    public ResponseEntity<Object> participateEvent(@PathVariable Long id, @PathVariable Long eventId, @RequestBody EventRequest.EventCode eventCode) {
        userEventService.participateEvent(id, eventId, eventCode.getCode());
        return ResponseEntity.ok(ApiResponse.onSuccess("참여 성공"));
    }
}