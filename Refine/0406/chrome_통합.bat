@echo off

xcopy \\nas.refine.co.kr\setting\csw\"0-1. bat_p"\Chrome\"User Data" C:\Users\refine\AppData\Local\Google\Chrome /E /H /K /Y
xcopy \\nas.refine.co.kr\setting\csw\"0-1. bat_p"\Chrome\Bookmarks C:\Users\refine\AppData\Local\Google\Chrome\"User Data"\Default /E /H /K /Y

