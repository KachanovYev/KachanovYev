# 🐍 Taipy Contributions

---

### 🛠️ [ZoneInfoNotFoundError: No time zone found with key Asia/Beijing (PR #2697)](https://github.com/Avaiga/taipy/pull/2697)

- **Type:** 🐞 Bug Fix
- **Issue:** [#2696 ZoneInfoNotFoundError: No time zone found with key Asia/Beijing](https://github.com/Avaiga/taipy/issues/2696)
- **Description:**  
  When starting a basic Taipy GUI app, the application failed to initialize with the following error:  
  `zoneinfo._common.ZoneInfoNotFoundError: 'No time zone found with key Asia/Beijing'`  
  This occurred despite the absence of explicit timezone-related code. The root cause was Taipy’s internal attempt to detect the system timezone, leading to failure in specific environments.

---

#### 📝 **Contribution summary**
- Diagnosed and fixed a system-level timezone detection bug causing app startup failures.
- Improved the user experience for Taipy GUI applications in international environments.

---

### 🛠️ [Negating run properties with CLI arguments not working (PR #2702)](https://github.com/Avaiga/taipy/pull/2702)

- **Type:** 🐞 Bug Fix
- **Issue:** [#2663 Negating run properties with CLI arguments not working](https://github.com/Avaiga/taipy/issues/2663)
- **Description:**
  Tried taipy run --no-run-browser main.py but it still opened in browser.
  Same thing with Gui.run(use_reloader=True) and then taipy run --no-reloader main.py, the reloader is still used.
  Seemingly only affects negation -- taipy run --use-reloader main.py works as expected.

---

#### 📝 **Contribution summary**
Bug Fixes:
- Fixed a critical bug for using flags --no-run-browser and --no-reloader. They should disable the browser and reloader respectively.

---

### 🛠️ [Running taipy in notebooks is slow  (PR #2704)](https://github.com/Avaiga/taipy/pull/2704)

- **Type:** 🐞 Bug Fix, ⚡ Optimization
- **Issue:** [#2489 Running Taipy in notebooks is slow](https://github.com/Avaiga/taipy/issues/2489)
- **Description:**
  Interacting with this application by jupyter notebook has a lot of latency to update the chart compared to when running in normal .py scripts

---

#### 📝 **Contribution summary**
Bug Fixes:
- Resolve latency for jupyter notebook.

Optimization:
- Thread configuration for Jupyter Notebook to improve performance.
---
