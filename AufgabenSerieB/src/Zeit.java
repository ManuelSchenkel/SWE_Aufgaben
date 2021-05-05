class Zeit {
    int sekunden, minuten, stunden;

    void anzeigen() {
        System.out.println("Zeit: " + stunden + ":" + minuten + ":" + sekunden);
    }

    int inSekunden() {
        int zeitInSekunden = (stunden * 3600) + (minuten * 60) + sekunden;
        return zeitInSekunden;
    }

    void setSekMinStd(int sek) {
        stunden = sek / 3600;
        minuten = (sek % 3600) / 60;
        sekunden = (sek % 3600) % 60;
    }

    Zeit add(Zeit zeit) {
        Zeit zeit3 = new Zeit();
        int summe = zeit.inSekunden() + inSekunden();
        zeit3.setSekMinStd(summe);
        return zeit3;
    }
}