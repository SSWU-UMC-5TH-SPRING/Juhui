package umc.spring.service.StoreService;

import umc.spring.domain.Store;
import umc.spring.web.dto.store.StoreRequestDTO;

public interface StoreCommandService {
    Store addRegion(StoreRequestDTO.AddRegionDto request);
}
