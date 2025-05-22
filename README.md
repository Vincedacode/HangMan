# Hangman Game 🎮

A classic **Hangman** game written in **Java**, played via the command line. It fetches random words from an external API and challenges the player to guess the word within 7 incorrect attempts.

---

## 📌 Features

- ✅ Random word fetched from an API
- ✅ Tracks guessed letters and remaining attempts
- ✅ Prevents repeated guesses
- ✅ Instructions and Menu
- ✅ Graceful error handling
- ✅ Option to restart or exit the game

---

## 📦 Project Structure

Hang_Man/
├── Main.java # Entry point and menu
├── HangManGame.java # Core game logic
└── WordProvider.java # Gets random word from online API

yaml
Copy
Edit

---

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher (uses `HttpClient`)
- Internet connection (for fetching random words)

### How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/hangman-java.git
   cd hangman-java
Compile the code:

bash
Copy
Edit
javac Hang_Man/*.java
Run the game:

bash
Copy
Edit
java Hang_Man.Main
🌐 API Used
Random Word API

🧠 How to Play
Guess the hidden word by entering one letter at a time.

You have 7 incorrect attempts before the game ends.

Each correct guess reveals part of the word.

Try to guess the entire word before you're out of attempts!

🛠️ Possible Improvements
Add difficulty levels

Offline fallback word list

🤝 Contributing
Contributions are welcome! Feel free to fork the repo and submit a pull request.

📄 License
This project is licensed under the MIT License.

👨‍💻 Author
Vincedacode
https://github.com/Vincedacode

yaml
Copy
Edit

---

Would you like me to generate a fallback word list or help you publish this to GitHub too?







