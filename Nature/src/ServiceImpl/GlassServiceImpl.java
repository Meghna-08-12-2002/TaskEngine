package ServiceImpl;

import dto.GlassDto;
import service.GlassService;

public class GlassServiceImpl implements GlassService {
    @Override
    public boolean save(GlassDto glassDto) {
        if (glassDto != null) {
            System.out.println("glassDto is null");
            return false;
        } else {
            if (glassDto.getBrand() == null || glassDto.getBrand().isEmpty()) {
                System.out.println("Brand is null or empty");
                return false;
            } else {
                if (glassDto.getMaterial() == null || glassDto.getMaterial().isEmpty()) {
                    System.out.println("Material is null or empty");
                    return false;
                } else {
                            System.out.println("GlassDto is valid: " + glassDto);
                            return true;
                        }
                    }
                }
            }
        }

