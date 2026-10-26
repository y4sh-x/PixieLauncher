---
name: Launcher brand and storage identity
description: Why the visible launcher name must remain separate from its persistent internal identifier.
---

Keep the visible app/build name separate from `launcher_storage_id`, which remains `ZalithLauncher` unless a deliberate data migration is planned. The persistent identifier namespaces settings and launcher-specific user data.

**Why:** Replacing the internal identifier as part of a rebrand can make existing preferences and per-version data appear missing to users.

**How to apply:** Change the app label, APK filename, and project links independently; keep persistent identifiers stable across rebrands.

For the V1 rebrand, keep the visible version name as `V1` while `versionCode` remains monotonic. Do not reset the numeric code to 1 to match the display label.

**Why:** The update checker compares `BuildConfig.VERSION_CODE`; lowering it can prevent updates from installing over existing builds.

**How to apply:** Treat `launcher_version_name` as a user-facing label and increment `launcher_version_code` for each release.
