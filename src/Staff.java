public abstract class Staff implements iStaff{
    int StaffNumber;
    String StaffLocation;

    @Override
    public int getStaffNumber() {
        return StaffNumber;
    }

    @Override
    public String getStaffLocation() {
        return StaffLocation;
    }
}
