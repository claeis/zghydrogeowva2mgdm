# zghydrogeowva2mgdm

-	Hydrogeologische Objekte (MGDM ID 66/141): Migration der Daten vom alten INTERLIS1-Modell (INTERLIS1-Transfer-Dateiformat ITF) 
  ins neue INTERLIS2-Modell (INTERLIS2-Transfer-Dateiformat XTF) und Rücktransformation vom INTERLIS2-Modell ins INTERLIS1-Modell
-	Wasserversorgungsatlas (MGDM ID 66/141): Migration der Daten vom alten INTERLIS1-Modell (INTERLIS1-Transfer-Dateiformat ITF) 
  ins neue INTERLIS2-Modell (INTERLIS2-Transfer-Dateiformat XTF)
-	Transformation vom neuen (kantonalen) INTERLIS 2 Modell (KGDM-XTF) in die beiden (Bundes-) MGDM-XTF (ID 66 und ID 141)

## 1x ITF (= Hydrogeoobjekte) -> 1x XTF (= KGDM)

Hydrogeologische Objekte (MGDM ID 66/141): Migration der Daten vom alten INTERLIS1-Modell (INTERLIS1-Transfer-Dateiformat ITF) 
ins neue INTERLIS2-Modell (INTERLIS2-Transfer-Dateiformat XTF)

```
java -jar zghydrogeowva2mgdm.jar --itfHydro2kgdm  --hydro zg_hydrogeoobj-in.itf  --kgdm kgdm-out.xtf
```

Wurden die Daten schon einmal migriert und/oder sollen sie mit den von WVA migrierten Daten zusammenfegührt werden,
muss als zusätzlicher Parameter `--kgdm0 kgdm-in.xtf` die bereits migrierten Daten mitgebeben werden.

```
java -jar zghydrogeowva2mgdm.jar --itfHydro2kgdm  --hydro zg_hydrogeoobj-in.itf --kgdm0 kgdm-in.xtf --kgdm kgdm-out.xtf
```

## 1x ITF (= WVA) -> 1x XTF (= KGDM)

Wasserversorgungsatlas (MGDM ID 66/141): Migration der Daten vom alten INTERLIS1-Modell (INTERLIS1-Transfer-Dateiformat ITF) 
  ins neue INTERLIS2-Modell (INTERLIS2-Transfer-Dateiformat XTF)

```
java -jar zghydrogeowva2mgdm.jar --itfWva2kgdm    --wva   ZG_WVA-in.ITF --kgdm kgdm-out.xtf
```

## 1x XTF (= KGDM) -> 1x ITF (Rücktransformation Hydrogeo)

Hydrogeologische Objekte (MGDM ID 66/141): Rücktransformation vom INTERLIS2-Modell ins INTERLIS1-Modell

```
java -jar zghydrogeowva2mgdm.jar --kgdm2itf  --kgdm kgdm-in.xtf --hydro zg_hydrogeoobj-out.itf
```

## 1x XTF (= KGDM) -> 2x XTF (für beide MGDM ID 66 und ID 141)

Transformation vom neuen (kantonalen) INTERLIS 2 Modell (KGDM-XTF) in die beiden (Bundes-) MGDM-XTF (ID 66 und ID 141)

```
java -jar zghydrogeowva2mgdm.jar --kgdm2mgdm  --kgdm kgdm-in.xtf --mgdmTwv mgdm_twv-out.xtf --mgdmGwa mgdm_gwa-out.xtf
```

## Parameter

Parameter          | Beschreibung
-------------------|-------------------
`--itfHydro2kgdm`  | Migration der Daten vom alten INTERLIS1-Modell Hydrogeologische Objekte (INTERLIS1-Transfer-Dateiformat ITF) ins neue INTERLIS2-Modell (INTERLIS2-Transfer-Dateiformat XTF)
`--itfWva2kgdm`    | Migration der Daten vom alten INTERLIS1-Modell Wasserversorgungsatlas (INTERLIS1-Transfer-Dateiformat ITF) ins neue INTERLIS2-Modell (INTERLIS2-Transfer-Dateiformat XTF)
`--kgdm2itf`       | Rücktransformation vom INTERLIS2-Modell ins INTERLIS1-Modell Hydrogeologische Objekte
`--kgdm2mgdm`      | Transformation vom neuen (kantonalen) INTERLIS 2 Modell (KGDM-XTF) in die beiden (Bundes-) MGDM-XTF
`--wva file.itf`   | Daten gem. kantonalem Modell ZG_Wasserversorgungsatlas_1_0
`--hydro file.itf` | Daten gem. kantonalem Modell ZG_HydrogeologischeObjekte_2_3
`--kgdm file.xtf`  | Daten gem. kantonalem Modell ZG_hydrogeo_wva_V1
`--kgdm0 file.xtf`   | Daten gem. kantonalem Modell ZG_hydrogeo_wva_V1
`--mgdmTwv file.xtf` | Daten gem. Bundesmodell TWVinNotlagen_LV95_V1
`--mgdmGwa file.xtf` | Daten gem. Bundesmodell Grundwasseraustritte_LV95_V1
`--disableValidation`  | schaltet die Validierung der Daten aus
`--log file.log`   | schreibt die Info- und Fehlermeldungen in eine Datei
`--modeldir directories` | Dateipfade, die Modell-Dateien (ili-Dateien) enthalten. Mehrere Pfade können durch Semikolon ‚;‘ getrennt werden. Es sind auch URLs von Modell-Repositories möglich. Default: ``%XTF_DIR;http://models.interlis.ch/``. ``%XTF_DIR`` ist ein Platzhalter für das Verzeichnis mit der ITF/XTF-Datei.
`--proxy host`     | Proxy Server für den Zugriff auf Modell Repositories
`--proxyPort port` | Proxy Port für den Zugriff auf Modell Repositories
`--trace`          | gibt während dem Programmlaufg detailiertere Meldungen aus
`--version`        | zeigt die Programmversion an
`--help`           | zeigt eine kurze Hilfe der Programmoptionen an
`--gui`            | startet die grafische Benutzeroberfläche
