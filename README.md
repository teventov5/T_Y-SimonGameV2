# SIMON GAME

The SIMON GAME is a classic memory game implemented in Java using Android Studio. The game challenges players to recall and repeat a sequence of colors generated by the app. It uses both visual and auditory stimuli to enhance memory recall. The project includes two main activities: the game screen and the game over screen.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Project Overview

The SIMON GAME consists of two main activities:

- **Main Activity**: The core gameplay activity where a sequence of colors is displayed, and the player must replicate the sequence. Each color is associated with a unique sound to provide both visual and auditory feedback. The game continues as long as the player successfully repeats the sequence. The top of the screen displays the current level and highest score. If the player makes an error, the game transitions to the game over screen.

- **Game Over Activity**: This screen appears when the player fails to replicate the sequence correctly. It shows the player's score (length of the sequence reached) and the highest score. If the player sets a new high score, celebratory music and applause are played, and a trophy is displayed. If the player does not beat the high score, a booing sound effect is played to motivate the player.

## Link to the demo video on youtube:

https://www.youtube.com/watch?v=SMfaXe8bmw0

## Features

- **Color Sequence Memory**: Players must remember and repeat a sequence of colors generated by the game.
- **Auditory Feedback**: Each color has a unique sound to aid memory recall.
- **Progress Tracking**: Displays the current level and highest score.
- **Game Over Screen**: Shows the final score, high score, and appropriate feedback (celebratory or motivational sounds).

## Technology Stack

- **Frontend**: Java (Android Studio)
- **Backend**: N/A
- **Database**: N/A

## Getting Started

### Prerequisites

To run this project, you need:

- **Android Studio**: The development environment for Android applications.
- **Java SDK**: Required for building and running Android applications.

### Installation

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/teventov5/T_Y-SimonGameV2.git

2. **Open the Project:**
   ```bash
	Open Android Studio.
	Select "Open an existing Android Studio project."
	Navigate to the project directory and open it.
	
3. **Build the Project:**:
   ```bash
	Click on "Build" in the Android Studio menu.
	Select "Rebuild Project" to ensure all dependencies are correctly set up.

4. **Run the App:**:
   ```bash
	Connect an Android device or start an emulator.
	Click on the "Run" button in Android Studio to install and run the app on the selected device or emulator.

## Usage

Play the game by following the color sequence displayed on the screen. Each time you correctly repeat the sequence, a new color is added. If you make a mistake, the game will transition to the game over screen, where you can see your score and the high score.

## Contributing

Contributions are welcome! If you have suggestions, feature requests, or issues, please open a pull request or issue on the GitHub repository.

## License

**This project is licensed under the MIT License. See the [LICENSE](LICENSE.md) file for details.**

## Acknowledgments

**Android Studio for the development environment.**
**Java for the programming language used.**
