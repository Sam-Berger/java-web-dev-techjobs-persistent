## Part 1: Test it with SQL

id: INT (this is also the primary key)
employer VARCHAR
name VARCHAR
skills VARCHAR

## Part 2: Test it with SQL

SELECT name
FROM techjobs.employer
WHERE (location="St. Louis City")

## Part 3: Test it with SQL

DROP TABLE `techjobs`.`job`;

## Part 4: Test it with SQL

Note to grader: The textbook says I need to use "is not null" but I am pretty sure this gives the looked for result
without it. If results are what matter, then this should suffice. If not, I will look at this again.

SELECT name, description
FROM techjobs.skill
INNER JOIN techjobs.job_skills ON techjobs.skill.id = techjobs.job_skills.skills_id
ORDER BY name