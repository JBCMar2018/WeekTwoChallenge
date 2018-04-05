package me.afua.weeklychallenge1;

public class Experience {

    private String title;
    private String organization;
    private String duties;
    private String startDate;
    private String endDate;

    public Experience() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        if(endDate.isEmpty() || endDate==null)
        { endDate = "Present";
        }
        this.endDate = endDate;
    }
}
