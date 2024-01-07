package softeer.tenten.controller.popup.area;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import softeer.tenten.dto.popup.area.VoteRequest;
import softeer.tenten.global.api.ApiResponse;
import softeer.tenten.service.popup.area.VoteService;

@RestController
@RequestMapping("/api/pop-up")
@RequiredArgsConstructor
public class VoteController {
    private final VoteService voteService;

    @GetMapping("/{id}/vote")
    public ResponseEntity<Object> getPopUpVote(@PathVariable Long id){
        return ResponseEntity.ok(ApiResponse.onSuccess(voteService.getPopUpVoteOption(id)));
    }

    @PostMapping("{id}/vote")
    public ResponseEntity<Object> createPopUpVote(@PathVariable Long id, @RequestBody VoteRequest.VoteOption voteOption){
        return ResponseEntity.ok(ApiResponse.onSuccess(voteService.createPopUpVote(id, voteOption)));
    }
}
