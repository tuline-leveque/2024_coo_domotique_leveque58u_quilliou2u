class Telecommande {
    //ATTRIBUT
    Lampe[] lampe;

    //CONSTRUCTEUR
    public Telecommande() {
        this.lampe = new Lampe[10];
    }

    //METHODES
    public void ajouterLampe(Lampe l) {
        int i=0;
        while (this.lampe[i] != null) {
            i++;
        }
        this.lampe[i] = l;
    }

    public void activerLampe(int indiceLampe) {
        this.lampe[indiceLampe].allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        this.lampe[indiceLampe].eteindre();
    }

    public void activerTout() {
        int i=0;
        while (this.lampe[i] != null) {
            this.lampe[i].allumer();
            i++;
        }
    }

    public String toString() {
        String texte = "";
        for (int i=0; i<this.lampe.length; i++) {
            texte = texte + this.lampe[i] + "\n";
        }
        return texte;
    }
}