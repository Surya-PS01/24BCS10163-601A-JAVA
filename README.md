I made a simple college result evaluation system. In this system every student follows the same steps: first moderation rules are applied, then marks are calculated and finally a grade is given.

Different programs calculate marks differently. BTech uses 70% theory and 30% lab marks, MCA uses 60% theory and 40% lab marks and PhD takes the average of theory and lab marks.

The main class is **EvaluationSoftware** which controls the whole process. BTech, MCA and PhD calculate marks using the **Program** interface. Rules like AttendanceRule, DifficultyRule and ManualRule use the **ModerationRule** interface and can be added or removed without changing the main program.
