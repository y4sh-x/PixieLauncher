---
name: Launcher brand and storage identity
description: Why the visible launcher name must remain separate from its persistent internal identifier.
---

Keep the visible app/build name separate from `launcher_storage_id`, which remains `ZalithLauncher` unless a deliberate data migration is planned. The persistent identifier namespaces settings and launcher-specific user data.

**Why:** Replacing the internal identifier as part of a rebrand can make existing preferences and per-version data appear missing to users.

**How to apply:** Change the app label, APK filename, and project links independently; keep persistent identifiers stable across rebrands.
