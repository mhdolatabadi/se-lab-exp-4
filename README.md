# گزارش قسمت Profiling

همانطور که در صورت آزمایش تصریح شده‌است در این آزمایش ما می‌مخواهیم با استفاده از ابزار YourKit اقدام به پروفایل گرفتن از برنامه مدنظر کنیم.
در ابتدا مطابق با دستورالعمل داده شده ابزار YourKit را نصب کرده و پس از اضافه IDE به آن آزمایش را انجام می‌دهیم.

در ابتدا عملیات پروفایل‌گیری را بر روی کلاس JavaCup اجرا کرده و در زیر تصاویر مربوط به پروفایل این کلاس را می‌بینیم:
![img.png](ProfilingTest/reportImages/img.png)

![img_1.png](ProfilingTest/reportImages/img_1.png)


همانطور که در تصاویر مشاهده می‌کنید مصرف CPU, Memory پس از اجرای برنامه افزایش یافته‌است و وقتی در تصویر اول توابع پر مصرف را شناسایی می‌کنید متوجه می‌شویم تابع temp در کلاس JavaCup مصرف زیادی دارد و باید آن‌ را اصلاح کرد.
و وقتی هم برنامه را اجرا می‌کنیم پس از مدتی با خطای java heap space روبرو می‌شویم که مربوط به memory allocation غیرلازم در حلقه‌های این تابع است.

برای بهینه کردن این تابع بهتر است که از arrayList استفاده نکنیم و در تصویر زیر تابع بعد از اعمال تغییرات را می‌بینید:
![img_2.png](ProfilingTest/reportImages/img_2.png)

حال پس از این تغییر اقدام به اجرای دوباره برنامه بر روی Yourkit می‌کنیم. و در شکل زیر تصاویر مربوط به مصرف CPU, Memory برنامه را مشاهده‌ می‌کنید:
![img_3.png](ProfilingTest/reportImages/img_3.png)

![img_4.png](ProfilingTest/reportImages/img_4.png)

که همانطور که مشاهده می‌شود مشکل برطرف شده و برنامه نیز به درستی اجرا می‌شود.

در ادامه قطعه کد دیگری به برنامه اضافه می‌کنیم و سعی می‌کنیم با استفاده از ابزار YourKit آن را پروفایل کنیم و بهبود دهیم.

یک کلاس جدید به نام CommonElements اضافه می‌کنیم که وظیفه‌ش این است که بین ۲ آرایه از اعداد تعداد المنت‌های مشترک را پیدا کنید و آن را چاپ کند که در تصویر زیر قطعه کد اولیه را مشاهده‌ می‌کنید:
![img.png](ProfilingTest/reportImages/img_5.png)

همانطور که در تصویر مشاهده‌کنید در تابع findCommonElements با استفاده از ۲ حلقه سعی میکنیم تعداد المنت‌های مشترک را پیدا کنیم.
حال این برنامه را با استفاده از YourKit آنالیز می‌کنیم که در ادامه تصاویر مربوط به مصرف Cpu, Memory را مشاهده‌ می‌کنید:

![img_1.png](ProfilingTest/reportImages/img_6.png)

![img_2.png](ProfilingTest/reportImages/img_7.png)

همانطور که در تصویر مشاهده می‌کنید تابع findCommonElement بیشترین مصرف را دارد و برنامه پس از مدتی با خطای java heap size متوقف می‌شود.

حال در ادامه می‌خواهیم برنامه را بهبود دهیم؛ برای این کار ابتدا بجای ArrayList از Set استفاده می‌کنیم و همچنین در ابتدا اجرای برنامه سایر Set را مقدار دهی می‌کنیم که در تصویر زیر کد اصلاح شده را مشاهده می‌کنید:
![img_3.png](ProfilingTest/reportImages/img_8.png)


حال دوباره برنامه را اجرا می‌کنیم و مصرف Cpu, Memory آن را بررسی می‌کنیم که تصاویر آن در زیر آمده‌است:

![img_4.png](ProfilingTest/reportImages/img_9.png)

![img_5.png](ProfilingTest/reportImages/img_10.png)

که همانطور که مشاهده می‌کنید مصرف کاهش پیدا کرده و برنامه نیز در مدت کوتاهی اجرا می‌شود و خروجی را چاپ می‌کند.

# گزارش قسمت BDD
# بخش اول (۱)
در تصاویر زیر اجرای مراحل ذکر شده در فایل Example.pdf به ترتیب نشان داده شده است. 


![Screenshot from 2024-08-06 22-31-52](https://github.com/user-attachments/assets/56930e5b-9826-4f84-acf1-945187694c34)

![Screenshot from 2024-08-06 22-33-52](https://github.com/user-attachments/assets/75f0c066-0fc1-450a-a374-b79ae1334d86)

![Screenshot from 2024-08-06 22-39-25](https://github.com/user-attachments/assets/03315138-4cbd-4510-9981-c023960ac60e)

![Screenshot from 2024-08-06 22-45-08](https://github.com/user-attachments/assets/9865750f-0509-406e-8655-c01b2add0d2e)

![Screenshot from 2024-08-06 23-12-42](https://github.com/user-attachments/assets/58f6cfa3-8fae-4b39-b9c7-d23039a3b415)

![Screenshot from 2024-08-06 23-16-39](https://github.com/user-attachments/assets/5fdf21a7-dae5-4a99-b152-f4a9ccb15b94)

![Screenshot from 2024-08-06 23-27-20](https://github.com/user-attachments/assets/1ec4c2c9-45e9-4b8f-90ef-3661b6acee7f)

![Screenshot from 2024-08-07 20-45-31](https://github.com/user-attachments/assets/46027d15-af95-4e17-903f-d0995bc05c6f)

# بخش دوم (۲)

این مشکل به این دلیل است که در رجکس تعریف شده ما اعداد منفی را در نظر نگرفته‌ایم (\\d+) و به همین دلیل موقع اجرای تست‌ها به این ارور میخوریم. برای اصلاح این مسئله کافی است تا رجکس مربوطه را با افزودن یک منفی به صورت اختیاری اصلاح کنیم یعنی هر جا که \\d+ داریم تبدیل به -؟\\d+ میشود. در تصویر انتهایی بخش قبل نیز نسخه‌ی اصلاح شده و سالم قابل مشاهده است که تمامی تست‌ها به درستی پاس شده‌اند.
