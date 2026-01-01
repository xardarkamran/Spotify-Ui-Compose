# Spotify UI Testing - Android App

A modern Android application built with Jetpack Compose that replicates Spotify's user interface for testing and learning purposes. This project demonstrates modern Android development practices using Kotlin and Jetpack Compose.

## 🚀 Features

- **Modern UI/UX**: Beautiful Spotify-inspired interface built with Material 3
- **Jetpack Compose**: Fully built with declarative UI framework
- **Navigation**: Seamless navigation between screens using Navigation Compose
- **Edge-to-Edge**: Modern edge-to-edge implementation with proper system bar handling
- **Multiple Screens**: 
  - Splash Screen
  - Login Screen
  - Sign Up Screen
  - Create Account Screen
  - Home Screen
  - Player Screen

## 📱 Screenshots

*Add screenshots of your app here*

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Material Design**: Material 3
- **Navigation**: Navigation Compose
- **Image Loading**: Coil
- **Architecture**: MVVM (Model-View-ViewModel)
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36
- **Compile SDK**: 36

## 📦 Dependencies

### Core Libraries
- `androidx.core:core-ktx` - Kotlin extensions for Android
- `androidx.lifecycle:lifecycle-runtime-ktx` - Lifecycle components
- `androidx.activity:activity-compose` - Compose Activity integration

### Compose Libraries
- `androidx.compose.ui:ui` - Compose UI toolkit
- `androidx.compose.material3:material3` - Material 3 components
- `androidx.compose.ui:ui-tooling-preview` - Preview support

### Navigation
- `androidx.navigation:navigation-compose` - Navigation for Compose

### Image Loading
- `io.coil-kt:coil-compose` - Image loading library

## 🏗️ Project Structure

```
app/src/main/java/com/navigation/live/spotifyuitesting/
├── MainActivity.kt                    # Main entry point
├── ui/
│   ├── screens/                      # All app screens
│   │   ├── splash/                   # Splash screen
│   │   ├── login_in/                 # Login screen
│   │   ├── sign_up/                  # Sign up screen
│   │   ├── create_account/           # Create account screen
│   │   ├── home_screen/              # Home screen
│   │   └── player/                   # Music player screen
│   ├── shared/                       # Shared components
│   │   ├── navigation/               # Navigation setup
│   │   │   ├── AppNavigation.kt     # Main navigation
│   │   │   └── AppRoutes.kt          # Route definitions
│   │   ├── component/                # Reusable components
│   │   └── utilz/                    # Utility functions
│   │       └── TransparentSystemBar.kt
│   └── theme/                        # App theming
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt
└── base/                             # Base classes
```

## 🚦 Getting Started

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or later
- JDK 11 or higher
- Android SDK with API level 24 or higher
- Gradle 8.9.1 or compatible version

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd SpotifyUiTesting
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Navigate to the project directory

3. **Sync Gradle**
   - Android Studio will automatically sync Gradle
   - Wait for the sync to complete

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`

## 🎨 Key Implementation Details

### Edge-to-Edge Implementation

The app uses modern edge-to-edge design with proper system bar handling:

```kotlin
enableEdgeToEdge()
TransparentSystemBar() // For Android Q and above
```

### Status Bar Handling

Proper window insets are handled using:
- `WindowInsets.statusBars` for status bar padding
- `windowInsetsPadding()` modifier for content positioning
- Transparent system bars for immersive experience

### Navigation Flow

```
Splash → Login/Sign Up → Create Account → Home → Player
```

## 🧪 Testing

The project includes test configurations for:
- Unit tests (JUnit)
- Instrumented tests (Espresso)
- Compose UI tests

Run tests using:
```bash
./gradlew test          # Unit tests
./gradlew connectedAndroidTest  # Instrumented tests
```

## 📝 Code Style

- Follow Kotlin coding conventions
- Use meaningful variable and function names
- Add comments for complex logic
- Maintain consistent formatting

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is for educational and testing purposes only. Spotify is a trademark of Spotify AB.

## 👨‍💻 Author

Developed by Fixton Technologies

## 🙏 Acknowledgments

- Spotify for UI/UX inspiration
- Jetpack Compose team for the amazing framework
- Android developer community

## 📧 Contact

For questions or suggestions, please open an issue in the repository.

---

**Note**: This is a UI testing project and does not include actual Spotify functionality or API integration.
