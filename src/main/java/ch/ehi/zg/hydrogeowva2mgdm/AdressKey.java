package ch.ehi.zg.hydrogeowva2mgdm;

import ch.interlis.models.ZG_hydrogeo_wva_V1.Wasserversorgung_Zug.Adresse;

public class AdressKey {

    private String name;
    private String vorname;
    private String adresse;
    private Integer plz;

    public AdressKey(String name, String vorname, String adresse, Integer plz) {
        super();
        this.name = name;
        this.vorname = vorname;
        this.plz = plz;
    }
    public AdressKey(Adresse src) {
        name=src.getName();
        vorname=src.getVorname();
        adresse=src.getAdresse();
        plz=src.getPLZ();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((plz == null) ? 0 : plz.hashCode());
        result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
        result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AdressKey other = (AdressKey) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (plz == null) {
            if (other.plz != null)
                return false;
        } else if (!plz.equals(other.plz))
            return false;
        if (vorname == null) {
            if (other.vorname != null)
                return false;
        } else if (!vorname.equals(other.vorname))
            return false;
        if (adresse == null) {
            if (other.adresse != null)
                return false;
        } else if (!adresse.equals(other.adresse))
            return false;
        return true;
    }

}
