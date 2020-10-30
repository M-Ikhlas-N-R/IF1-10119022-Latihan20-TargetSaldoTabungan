package com.latihan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Target Saldo Tabungan Latihan 20
 *
 */
public class TargetSaldo {
    public static void main(String[] args) {
        // Deklarasi Variabel
        double saldoAwal = 3500000,
                bunga,
                saldoTarget = 6000000;
        int i = 1;
        String saldo;

        // Formating Currency Start
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        // Formating Currency END

        while (saldoAwal < saldoTarget || saldoAwal > 7000000) {
            bunga = saldoAwal * 0.08;
            saldoAwal = Math.floor(saldoAwal + bunga);
            saldo = kursIndonesia.format(saldoAwal);
            String[] parts = saldo.split(",");
            saldo = parts[0];

            System.out.println("Saldo di bulan ke-" + i + " " + saldo);
            i++;
        }
    }
}
