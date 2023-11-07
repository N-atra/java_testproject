package model;

public class UserData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homepage;
    private final String bday;
    private final String bmonth;
    private final String byear;
    private final String aday;
    private final String amonth;
    private final String ayear;
    private final String address2;
    private final String phone2;
    private final String notes;

    public UserData(final String firstname, final String middlename, final String lastname, final String nickname, final String title, final String company, final String address, final String home, final String mobile, final String work, final String fax, final String email, final String email2, final String email3, final String homepage, final String bday, final String bmonth, final String byear, final String aday, final String amonth, final String ayear, final String address2, final String phone2, final String notes) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.aday = aday;
        this.amonth = amonth;
        this.ayear = ayear;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getMiddlename() {
        return middlename;
    }
    public String getLastname() {
        return lastname;
    }
    public String getNickname() {
        return nickname;
    }
    public String getTitle() {
        return title;
    }
    public String getCompany() {
        return company;
    }
    public String getAddress() {
        return address;
    }
    public String getHome() {
        return home;
    }
    public String getMobile() {
        return mobile;
    }
    public String getWork() {
        return work;
    }
    public String getFax() {
        return fax;
    }
    public String getEmail() {
        return email;
    }
    public String getEmail2() {
        return email2;
    }
    public String getEmail3() {
        return email3;
    }
    public String getHomepage() {
        return homepage;
    }
    public String getBday() {
        return bday;
    }
    public String getBmonth() {
        return bmonth;
    }
    public String getByear() {
        return byear;
    }
    public String getAday() {
        return aday;
    }
    public String getAmonth() {
        return amonth;
    }
    public String getAyear() {
        return ayear;
    }
    public String getAddress2() {
        return address2;
    }
    public String getPhone2() {
        return phone2;
    }
    public String getNotes() {
        return notes;
    }

    public UserData() {
        this(
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
    }

    public UserData(final String firstname, final String middlename, final String lastname) {
        this(
                firstname,
                middlename,
                lastname,
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        );
    }



}
