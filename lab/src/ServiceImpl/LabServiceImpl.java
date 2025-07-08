package ServiceImpl;

import Service.LaboratoryService;
import dto.LabDto;

public class LabServiceImpl implements LaboratoryService {
    @Override
    public boolean save(LabDto dto) {
        System.out.println("Running Save in LabServiceImpl");
        if (dto != null) {
            System.out.println("Laboratory is not null");
            String name = dto.getName();
            if (name != null && name.length() >= 3 && name.length() <= 20) {
                System.out.println("Valid name");
            } else {
                System.out.println("Invalid name");
                return false;
            }
            String gender = dto.getGender();
            if(gender!=null && !gender.isEmpty()){
                System.out.println("valid gender");
            }
            else {
                System.err.println("invalid gender");
                return false;
            }
        } else {
            System.err.println("Laboratory is null, Error in saving");
            return false;
        }
        return  true;
    }
}