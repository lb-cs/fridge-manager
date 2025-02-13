# fridge-manager

## Prerequisites

---
## Step 1: Check If Maven Is Installed

Before installing Maven, check if it's already installed:
```sh
mvn -version
```
If Maven is installed, you should see output like:
```
Apache Maven 3.8.6 (…)
Maven home: /usr/share/maven
Java version: 17.0.2, vendor: Oracle Corporation
```
If you see **"Command not found"**, proceed with the installation.

---
## Step 2: Install Maven on Your OS

### Windows (Using Chocolatey)
1. Open **PowerShell as Administrator**.
2. Run:
   ```sh
   choco install maven
   ```
3. Restart your terminal and verify installation:
   ```sh
   mvn -version
   ```

#### Alternative: Manual Installation
1. **Download Maven** from [Apache Maven Official Site](https://maven.apache.org/download.cgi).
2. Extract it to `C:\Program Files\Apache\Maven`.
3. **Set Environment Variables:**
   - Add `C:\Program Files\Apache\Maven\bin` to the **System PATH**.
   - Set `MAVEN_HOME` to `C:\Program Files\Apache\Maven`.
4. Open a new **Command Prompt** and test:
   ```sh
   mvn -version
   ```

---
### macOS (Using Homebrew)
1. Open **Terminal** and run:
   ```sh
   brew install maven
   ```
2. Verify installation:
   ```sh
   mvn -version
   ```

---
### Linux (Debian/Ubuntu)
1. Open Terminal and run:
   ```sh
   sudo apt update
   sudo apt install maven -y
   ```
2. Check if Maven is installed:
   ```sh
   mvn -version
   ```

#### Alternative: Manual Installation
1. **Download** Maven:
   ```sh
   wget https://downloads.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.tar.gz
   ```
2. **Extract & Move Maven**:
   ```sh
   tar -xvzf apache-maven-3.9.6-bin.tar.gz
   sudo mv apache-maven-3.9.6 /opt/maven
   ```
3. **Set Environment Variables**:
   ```sh
   echo 'export MAVEN_HOME=/opt/maven' >> ~/.bashrc
   echo 'export PATH=$MAVEN_HOME/bin:$PATH' >> ~/.bashrc
   source ~/.bashrc
   ```
4. **Verify Installation**:
   ```sh
   mvn -version
   ```

---
## Step 3: Verify Java Installation
Maven requires **Java Development Kit (JDK)**. Check if Java is installed:
```sh
java -version
```
If not installed, download it from [Java's Website](https://www.oracle.com/java/technologies/downloads) or install via your package manager.

---

## Step 4: Build and Run Your JavaFX Application
### **1️⃣ Compile and Build the Project**
```sh
mvn clean package
```

### **2️⃣ Run the JavaFX Application**
```sh
mvn clean javafx:run
```

---
## 🎯 Troubleshooting
### ❌ **Error: `mvn` command not found?**
- Ensure `Maven` is installed and added to your system's `PATH`.
- Restart your terminal after installation.
