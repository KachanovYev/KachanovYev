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
- Collaborated transparently with Taipy maintainers during investigation and review.

---