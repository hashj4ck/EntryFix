# EntryFix 

___ 

## Features

### Dropdown
- Applikation
 - Benuter wechseln
 - Abmelden
 - Beenden

- Einstellung
 - Speicherpfade

- Berichte
 - Ereignis-Log

___ 

### Grunddaten
- Kassierer(Benutzerverwaltung)
- Kassen
- Personentypen (Erwachsener, Kind, Student, ...)
- Standorte(Eingänge von einem Eventort)
- Mehrwertsteuer 
- Bezahlmethoden (Bar, Karte, Mobil)
- Währung

___

## Usecase (Admin)
- Veranstaltung anlegen
 - Events anlegen
  - Anmeldung? (Ja, Nein)
  - kassierer zuordnen
  - Artikel einrichten
   - Packages
  - Verkäufskanäle
  - Eingänge zuordnen 
  - Tastaturlayouts der Kassierer

- Berichte anzeigen
 - Verkaufe (Karten, Art, Kasse)
 - Gesamtumsatz (nach Zeitraum)
 - Allgemein-Zutritte
 
 ___ 

## Usecase (Kassierer)

Alle folgenden Zugänge ist ein Login erforderlich

- Tickets verkaufen vorort  
 - Ticketart auswählen ggf. Package auswählen 
 - Gutscheincode eingeben/scannen 
 - angebotene Bezahlart wählen 
 - Beleg drucken
 - Einlass 

- Tickets verkaufen (bereits gekauft)
 - Barcode validieren 
 - Benutzer verifizieren (Personamen abgleich)
 - Einlass 

