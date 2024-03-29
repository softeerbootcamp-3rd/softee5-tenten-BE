package softeer.tenten.mapper.waiting;

import softeer.tenten.entity.popup.Popup;
import softeer.tenten.entity.waiting.Waiting;
import softeer.tenten.dto.popup.waiting.WaitingResponse;
import softeer.tenten.entity.user.User;

import java.time.LocalDateTime;

public class WaitingMapper {
    public static Waiting toWaiting(User user, Popup popup){
        return Waiting.builder()
                .user(user)
                .popup(popup)
                .createdAt(LocalDateTime.now())
                .status(1)
                .build();
    }

    public static WaitingResponse.WaitingInformation toWaitingInformation(Long id, Integer waitingNumber, Integer orderNumber){
        return WaitingResponse.WaitingInformation.builder()
                .id(id)
                .waitingNumber(waitingNumber)
                .orderNumber(orderNumber)
                .build();
    }
}
