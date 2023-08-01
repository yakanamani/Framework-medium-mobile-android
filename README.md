# Framework_Medium_Android
Framework_Medium_Android est un framework d'automatisation mobile basé sur Appium, Cucumber et TestNG et qui s'exécute sur les devices et émulateurs Android.

Si vous souhaitez tester une application mobile de préférence sur Android.</br>
🌟Si vous êtes `TESTEUR AUTOMATICIEN` et que vous voulez apprendre à automatiser des tests fonctionnels.</br>
🌟Si vous êtes un `RECRUTEUR` pour évaluer les compétences de nos testeurs automaticiens talentueux.</br>
🌟 Ou encore si vous êtes un `PARTICULIER`ou une `ENTREPRISE` à la recherche de solution
répondant à vos besoins d'automatisation en test alors ce framework est fait pour vous!</br></br>
🎁 Ce framework permet d'exécuter vos tests (scénarios) en séquentiel sur le périphérique Android de votre choix, 
que ce soit un device physique ou un émulateur.</br>
🎁 Il s'exécute également sur la plateforme `Windows 10 et 11`.</br>
🎁Il contient plusieurs modèles et bonnes pratiques comme le `Page Object Model`, le `page Factory` qui vous permettent d'avoir un framework assez `Robuste`, `Réutisable`, `Maintenable` et `Rapide`.</br>
🎁Il offre également des `Logs` qui vous fournissent une traçabilité, des informations pertinentes
sur l'exécution de vos tests et aident à déboguer le framework en cas d'échec des tests.</br>
🎁Il contient aussi du reporting avec le rapport `allure` pour vous permettre d'avoir une visibilité de la couverture des tests effectués avec succès et des tests qui ont échoués.</br></br>

### 🎯Sommaire:
🏷️[Architecture et Présentation du framework](#architecture-et-présentation-du-framework)<br/>
🏷️[Technologies et outils utilisés](#technologies-et-outils-utilisés)<br/>
🏷️[Fonctionnalités](#fonctionnalités)<br/>
🏷️[Environnement de développement](#environnement-de-développement)<br/>
🏷️[Installation du framework](#installation-du-framework) <br/>
🏷️[Pré-requis](#prérequis)<br/>
🏷️[Mise à jour du fichier testng.xml](#mise-à-jour-du-fichier-testngxml)<br/>
🏷️[Exécution du framework](#exécution-du-framework)<br/>
🏷️[Mise à jour et adaptation du Framework](#mise-à-jour-et-adaptation-du-framework)<br/>
🏷️[Déboggage et Maintenance](#déboggage-et-maintenance)<br/>

### 🎯Architecture et Présentation du Framework

````
📦framework-medium-mobile-android
┣ 📂src
┃ ┣ 📂main
┃ ┃ ┣ 📂java
┃ ┃ ┃ ┣📂FrameworkMediumAndroid.utils
┃ ┃ ┃ ┃ ┗ 📜CapabilitiesManager.java
┃ ┃ ┃ ┃ ┗ 📜DriverManager.java
┃ ┃ ┃ ┃ ┗ 📜GlobalParams.java
┃ ┃ ┃ ┃ ┗ 📜PropertyManager.java
┃ ┃ ┃ ┃ ┗ 📜ServerManager.java
┃ ┃ ┃ ┃ ┗ 📜TestUtils.java
┃ ┃ ┣ 📂resources
┃ ┃ ┃ ┗ 📜config.properties
┃ ┃ ┃ ┗ 📑log4j2.xml
┃ ┣ 📂test
┃ ┃ ┣ 📂java
┃ ┃ ┃ ┣📂FrameworkkMediumAndroid
┃ ┃ ┃ ┃ ┣ 📂pages
┃ ┃ ┃ ┃ ┃ ┗ 📜BasePage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜LoginPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜MenuPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜ProductDetailsPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜ProductsPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜SettingsPage.java
┃ ┃ ┃ ┃ ┃ ┣ 📂runners
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MytestngRunnerTest.java
┃ ┃ ┃ ┃ ┃ ┣ 📂stepdef
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Hooks.java
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginStepDef.java
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductStepDef.java
┃ ┃ ┃ ┃ ┃ ┗ 📜Main.java
┃ ┃ ┣ 📂resources
┃ ┃ ┃ ┃ ┣ 📂app
┃ ┃ ┃ ┃ ┃ ┗ 📑Android.SauceLabs.Mobile.Sample.app.2.7.1.apk
┃ ┃ ┃ ┃ ┗ 📑allure.properties
┃ ┃ ┃ ┃ ┗ 📑Login.feature
┃ ┃ ┃ ┃ ┗ 📑Products.feature
┃ ┃ ┣ 📂Test-output
┃ ┃ ┃ ┗ 📂allure-report
┃ ┃ ┃ ┗ 📂allure-results
┣ 📑pom.xml
┣ 📑README.md
┣ 📑testng.xml
````

## 🎯Technologies et outils utilisés
➡️ IntelliJ - IDE<br/>
➡️ Appium - Mobile Automation library<br/>
➡️ Maven - Build automation tool<br/>
➡️ Java - Programming language<br/>
➡️ Cucumber - BDD <br/>
➡️ TestNG - Unit testing framework<br/>
➡️ Log4J - Logging framework<br/>
➡️ Allure Reports - Reporting framework<br/>

## 🎯Fonctionnalités

✅ Abstraction layer pour les intérations UI (click, sendkeys, ...)<br/>
✅ Paramétrisation par les fichier TestNG XML et config.properties<br/>
✅ Abstraction layer pour les jeux de données<br/>
✅ Abstraction layer pour les textes statiques<br/>
✅ Exécution sur devices physiques (et/ou Emulateurs/Simulateurs ) Android et iOS<br/>
✅ Démarrage automatique programmé du serveur Appium<br/>
✅ Cucumber-HTML-Reporter plugin<br/>
✅ Gestion des logs  avec Log4J2 Logging framework<br/>

## 🎯Environnement de développement

| **Logiciel**                   | **version**       | **Description**                                                                                                                                                          | **Windows** | **Macbook** |
|--------------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|-------------|
| Java JDK                       | JAVA 11           | [Dowloadable here](https://www.oracle.com/eg/java/technologies/javase/jdk11-archive-downloads.html)                                                                      | X           | X           |
| Android SDK via Android studio | current available | [Dowloadable here](https://developer.android.com/studio?gclid=Cj0KCQjwuLShBhC_ARIsAFod4fIcuMWb00yxfjGTPrFEemQ_pc3UrvmvB45VSYcnueWrfyX8fLJpz_4aAthfEALw_wcB&gclsrc=aw.ds) | X           | X           |
| Node.js                        | 18.15.0           | [Dowloadable here](https://nodejs.org/en/download)                                                                                                                       | X           | X           |
| npm                            | 9.5.0             | Downloaded with node.js                                                                                                                                                  | X           | X           |
| appium                         | 2.0.0-beta.59     | terminal: npm install -g appium@next                                                                                                                                     | X           | X           |
| UiAutomator                    | current available | terminal: appium driver install uiautomator                                                                                                                              | X           | X           |
| appium client (wd)             | current available | terminal: npm install wd                                                                                                                                                 | X           | X           |
| maven                          | 3.8.6             | [Downloadable here](https://maven.apache.org/download.cgi)                                                                                                               | X           | X           |
| Allure                         | current available | [Downloadable here](https://docs.qameta.io/allure/)                                                                                                                      | X           | X           |

## 🎯 Installation du framework

#### Prérequis
🟥 NB: POUR EXÉCUTER CE FRAMEWORK, VOUS DEVEZ AVOIR UNE BONNE CONNEXION INTERNET !

- Devices
  - 📌**Device physique**

    | **Description**                       | **Obligatoire** |
    |---------------------------------------|-----------------|
    | Mode développeur activé sur le device | x               | 
    | Débogage usb activé                   | x               | 
    | Connexion internet activée            | x               | 
    | Device déverouillé                    | x               | 
    | Device connecté au poste via usb      | x               | 

  - 📌**Emulateur** : </br>
    - L'émulateur doit être lancé et en bon état de marche


#### 🎯Mise à jour du fichier testng.xml
- Remplir les informations concernant le device utilisé pour les tests automatisés  
Les informations concernant les caractéristiques du device sont a modifier dans le fichier testng.xml (path_du_repertoire_du_framework/testng.xml)

  1) **Mettre a jour le paramètre udid**:
     Il est récupérable depuis le terminal (Le device doit etre connecté a l'ordinateur(device physique) ou démarré (device virtuel))
     ```shell
         # Terminal  
         adb devices
     ```
  2) **Mettre à jour le paramètre deviceName**
  3) **Mettre à jour le paramètre virtualDevice**
     Il prendra pour valeur **true** or "false"
     - true = emulator
     - false = real device
- **exemple**
```xml
        <parameter name="platformName" value="Android"/>
        <parameter name="udid" value="virtual_device_udid"/>
        <parameter name="deviceName" value="virtual_device_name"/>
        <parameter name="virtualDevice" value="true"/>
```
- 📌**Paramètres obligatoires** :
  - udid
  - deviceName
  - virtualDevice
  - systemPort
  - chromeDriverPort
- 🟥**Important** : la valeur choisie pour chacun des paramètres suivants doit être unique et différente des autres valeurs
  - systemPort
  - chromeDriverPort
  
## 🎯Exécution du framework
- **Depuis l'IDE**:</br>
  - Option 1: </br>
    Depuis un éditeur de code, lancer l'exécution du fichier **main.java**  
    (*chemin d'accès : src/test/java/FrameworkMediumAndroid/Main.java*) 
  - Option 2 : </br>
    Depuis un éditeur de code, lancer l'exécution du fichier **testng.xml**
- **Depuis la CLI** (Command Line Interface = invite de commandes):</br>
Commandes a exécuter depuis un terminal:
```shell
  cd project_repository
  mvn clean test
```

## 🎯Mise à jour et adaptation du Framework

### 🪙Ajout d'une nouvelle application 
1. Ajouter la(les) nouvelle(s) application(s) dans le dossier **apps** (_chemin d'accès_: src/test/resources/apps)
2. Mettre a jour les informations de l'application dans le fichier **config.properties**(_chemin d'accès_: src/main/resources/config.properties)</br>

   | **Variable**       | **value**         |   
   |--------------------|-------------------|
   | androidAppLocation | apk_path          | 
   | androidAppActivity | apk_activity_name | 
   | androidAppPackage  | apk_package_name  |

### 🪙Ajout de nouveaux scénarios
1. Ajouter le nouveau _feature file_ dans le dossier src/test/resources suivant le template suivant:
```gherkin
@test
Feature: write here your feature title

Scenario: write here scenario title 
Given I do first step
When I do second step next
Then thrid step should be expected result
```

```gherkin
@test
Feature: Login scenarios

Scenario Outline: write here scenario title (scenario with datas)
Given this first step
When I use this data: "<username>"
And this data: "<password>"
Then I should get this data: "<err>"
Examples:
| username | password | err |
| invalidUsername | secret_sauce | Username and password do not match any user in this service. |
```
2. Définir les methodes de "steps definition" dans le dossier **stepdef** (_chemin d'accès : src/test/java/FrameworkMediumAndroid/stepdef_)
3. En utilisant le Page Object Model design, créer les pages contentant les object spécifiques dans le dossier **pages** (_Chemin d'accès: src/test/java/FrameworkMediumAndroid/pages_)
4. Utiliser les "objets" créés pour la redaction des methodes de step definition

## 🎯Déboggage et Maintenance

### 🔴Débogage
- Erreur suite à une tentative de **_Build module_** :
  Vérifier que l'environnement de travail et l'IDE sont bien paramétrés pour **Java 11**
- Erreur suite à une tentative de **_maven compile_** :
  Vérifier que l'environnement de travail et l'IDE sont bien paramétrés pour **Java 11**

### 🔴Maintenance
- Dépendances:
  Régulièrement vérifier le fichier pom.xml pour s'assurer que les dependances sont a jour, si non les mettre a jour.
  Site de téléchargement des dépendances maven : https://mvnrepository.com
