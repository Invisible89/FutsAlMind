package bean;

/**
 * Created by Alessandro on 29/03/2015.
 */
public class Player {

    // Nome della tabella
    public String TABLE_NAME            = "Player";

    // Campi della tabella
    public String FIELD_IDTEAM          = "IdTeam";
    public String FIELD_ID              = "Id";
    public String FIELD_NAME            = "Name";
    public String FIELD_SURNAME         = "Surname";
    public String FIELD_BIRTHDATE       = "BirthDate";
    public String FIELD_IDNATION        = "IdNation";
    public String FIELD_IDROLE          = "IdRole";
    public String FIELD_TELEPHONENUMBER = "TelephoneNumber";
    public String FIELD_EMAIL           = "Email";

    // Funzioni per la scrittura (credo!!)
//    private int IdTeam;
    private int Id;
    private String Name;
    private String Surname;
    private long BirthDate;
    private int IdNation;
    private int IdRole;
    private String TelephoneNumber;
    private String Email;

//    public int getIdTeam() {
//        return IdTeam;
//    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public long getBirthDate() {
        return BirthDate;
    }

    public int getIdNation() {
        return IdNation;
    }

    public int getIdRole() {
        return IdRole;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    // Da capire perché c sono due player
    public Player(){}

    public Player(int Id, String Name, String Surname, long BirthDate, int IdNation, int IdRole, String TelephoneNumber, String Email){

//        this.IdTeam=IdTeam;
        this.Id=Id;
        this.Name=Name;
        this.Surname=Surname;
        this.BirthDate=BirthDate;
        this.IdNation=IdNation;
        this.IdRole=IdRole;
        this.TelephoneNumber=TelephoneNumber;
        this.Email=Email;

    }


}
