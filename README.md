# PixieLauncher

PixieLauncher is a community rebrand of ZalithLauncher2, an Android launcher for Minecraft: Java Edition. It continues the upstream project with its launcher, authentication, download, runtime, file-management, and game-launching functionality.

## Features

- Microsoft account authentication
- Minecraft Java Edition version and mod loader downloads
- Java runtime management
- Built-in file manager
- Customizable touch controls and launcher settings
- Android-native interface and game launch support

## Install

Download a compatible APK from the [PixieLauncher Releases](https://github.com/y4sh-x/PixieLauncher/releases) page and install it on an Android device. The launcher requires Android 8.0 (API 26) or newer.

## Build

Use JDK 17 or newer, Android SDK Platform 37.2, Android Build Tools, and NDK 25.2.9519653.

Build the debug APK from the repository root:

```shell
./gradlew assembleDebug
```

The APK is written under `PixieLauncher/build/outputs/apk/debug/`. To build only the app module, use:

```shell
./gradlew :PixieLauncher:assembleDebug
```

Configure optional authentication and service credentials locally when needed; do not commit private credentials.

## Attribution and licenses

PixieLauncher is derived from the open-source [ZalithLauncher2 project](https://github.com/ZalithLauncher/ZalithLauncher2). The upstream launcher was developed by MovTery and its contributors. PixieLauncher is a rebrand, not an assertion of authorship of the original ZalithLauncher code.

Original source copyright and license notices, upstream references, and bundled third-party notices are retained. The launcher source headers identify the GNU General Public License, version 3 or (at your option) any later version. Third-party components may be under separate terms; consult their bundled notices and the in-app license information.

## Project

- PixieLauncher maintainer: [YASH](https://github.com/y4sh-x)
- PixieLauncher repository: <https://github.com/y4sh-x/PixieLauncher>
- Upstream source: <https://github.com/ZalithLauncher/ZalithLauncher2>
