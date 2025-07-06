## taipy Contributions

### 1. [ZoneInfoNotFoundError: No time zone found with key Asia/Beijing (PR #2697)](https://github.com/Avaiga/taipy/pull/2697) 

- **Type:** Bug Fix
- **Issue:** [ZoneInfoNotFoundError: No time zone found with key Asia/Beijing](https://github.com/Avaiga/taipy/issues/2696)
- **Description:**  
  When starting a basic Taipy GUI app, the application fails to initialize with the following error:
  zoneinfo._common.ZoneInfoNotFoundError: 'No time zone found with key Asia/Beijing' 
  This occurs even though no explicit timezone-related code is used. The issue seems to be triggered by Taipy internally 
  attempting to detect the system timezone.

#### Contribution summary
