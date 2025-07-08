package Repository;

import Dto.StampedeCaseDto;

public interface StampedeCaseRepository {
    boolean  persist(StampedeCaseDto stampedeCaseDto);
}
