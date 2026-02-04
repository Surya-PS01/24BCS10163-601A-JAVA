This program is a simple college result evaluation system. Every student follows the same process, first moderation rules are applied, then marks are calculated and after that grade is given.

Different courses calculate marks differently. BTech uses 70% theory and 30% lab. MCA uses 60% theory and 40% lab. PhD just takes average of theory and lab marks.

The parent class is EvaluationSoftware which controls the whole evaluation flow. The child class is software which is used to create the object.

BTech, MCA and PhD give their own way of calculating marks using the Program interface. The rules like AttendanceRule, DifficultyRule and ManualRule use the ModerationRule interface and they can be added or removed without changing the main program.
