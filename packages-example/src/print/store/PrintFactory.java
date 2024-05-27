package print.store;

import print.MultifuctionalMachine;
import print.machines.Deskjet;
import print.machines.Laserjet;
import print.machines.PrinterMachine;
import print.machines.copy.CopyMachine;
import print.machines.scanner.Scanner;
import print.machines.scanner.ScannerMachine;

public class PrintFactory {
	public static void main(String[] args) {
		
		MultifuctionalMachine mltfmachine = new MultifuctionalMachine();
		Deskjet deskjet = new Deskjet();
		
		
		PrinterMachine printer = deskjet ;
		ScannerMachine scanner = mltfmachine ;
		CopyMachine copyMachine = mltfmachine ;
		
		printer.printing();
		scanner.scanning();
		copyMachine.copying();
	}
}
