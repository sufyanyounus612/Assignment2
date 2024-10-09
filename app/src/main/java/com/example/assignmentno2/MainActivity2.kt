package com.example.assignmentno2

import BlogAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adaptor: BlogAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recyclerView = findViewById(R.id.recyclerview)
        val blogList = listOf(
            model_class("https://www.anytimefitness.co.in/wp-content/uploads/2024/09/featured-image-physical-health-768x402.jpg",
                "How Physical Activity Boosts Mental Health and Well-Being?  \n",
                "There’s no denying the fact that exercise is essential for our physical health and mental well-being. Being physically active is crucial for everyone, be it for kids, adults, or elderly individuals. It is a lifesaver that promotes mental health and well-being. Thus, we can say that exercise and mental health are co-related.  \n" +
                        "\n" +
                        "One should not find a specific reason to exercise, it can be done for various purposes, such as recreation, enjoyment, or fitness. It is certainly a lifestyle change that can seriously impact your health and make you physically fit. Let’s talk about exercise and mental health in detail!  \n" +
                        "\n" +
                        "Physical Activity and Its Importance  \n  In general, physical activity is any kind of movement your body makes that involves muscles while expanding energy. One of the notable things is that physical activity can be done in endless ways and there will be an activity that suits almost every individual. It is always advisable to spend 75-150 minutes on any physical activity, it can be anything, ranging from walking, running, aerobics, cycling, swimming, performing yoga, meditation, to working out in the gym. These can be the activities that boost your heart rate, make you breathe faster and warmer.  \n" +
                        "\n" +
                        "Types of Physical Activities for Mental Health Benefits \n We can categorize physical activities into four parallels, as exercise and mental well-being goes hand in hand. These can be:  \n" +
                        "\n" +
                        "Regular Physical Activity– Any recreational or leisure-time activity, walking or cycling, workplace activities, household chores, games, sports, or even planned workouts in the context of daily life can be incorporated in the regular physical activities. These can be counted on for mental health and fitness.  \n" +
                        "\n" +
                        "Exercise- This aspect includes some of the purposeful activities that can be performed to improve health and mental well-being. These activities can be cycling, jogging, or lifting weights to improve strength. \n" +
                        "\n" +
                        "Playing- As we know, physical movement is not only essential for adults, but also crucial at every level, be it a child. Playful activities are a type of physical activity that can be done for fun or enjoyment, and mental well-being. Playing can be considered good for both mental health and fitness.  \n" +
                        "\n" +
                        "Sport- The fun, structured, and competitive activities that incorporate sports like football or squash to cricket. These are the types of physical activities that can be played as a part of a team. These physical activities can vary in intensity and involve high-intensity activities, thus perfectly summing up as exercises. \n How much Physical Activity is Recommended? \n As we have talked about physical activity, let us tell you how much it is recommended. There is no particular answer to that! Every individual has their recommendation, as per their body.  \n" +
                        "\n" +
                        "There are various studies that suggest that adults should incorporate at least 150 minutes (about 2 and a half hours) of moderate- to intense aerobic physical activity every week. The activities do not have to be non-stop, such as an aerobics class. You can start from 10 minutes or more at a time throughout the day to reach your regular goals.  \n" +
                        "\n" +
                        "Whatever physical activities you pursue in a day, the goal should be to stay active every day, it can exceptionally impact on your mental health and mental well-being. Let us provide you with some tips!  \n" +
                        "\n" +
                        "Always make time for a little walking during your workday. Walking keeps your mind at peace, thus boosting your mental health and fitness. Even if you are busy at work, take a 5-minute walk whenever you can, you can try having walking meetings! You will feel a lot better when you sit down again. \n" +
                        "Try and take stairs and not elevators whenever possible.  \n" +
                        "Take some breaks during the day to stretch and move, even if just for a few minutes at a time. \n" +
                        "Connection between Physical Health and Mental Health  \n Humans feel better after doing any exercise or physical activity. It can boost our mood, focus, and make us aware. Further, exercise is essential as it helps us to maintain a positive outlook on our life.  \n" +
                        "\n" +
                        "There are many people who think that the link between exercise and mental health is complicated. Let us tell you that the connection between physical health and mental health cannot be overlooked, in fact, inactiveness can be a cause of mental illness. Nonetheless, there are various ways in which exercise can benefit our mental health, such as: \n" +
                        "\n" +
                        " When we exercise, the levels of chemicals in our brain change, such as it improves serotonin (natural mood lifter) and endorphins (the happy hormone) in our body.  \n" +
                        "Regular exercise can also help us to make our sleep schedule better, which ultimately helps us lift our mood. There is an exceptional Importance of Sleep in your Muscle Recovery, you should check it out.  \n" +
                        "Physical activity can further improve our sense of control, coping aptitudes, and our self-esteem. People who exercise regularly often report how good achieving a goal makes them feel. Those who exercise on a regular interval report how good they feel after achieving their goals.  \n" +
                        "Moreover, exercise can also distract us from having negative thoughts. \n" +
                        "Not only this, exercise at gyms and fitness centers offers an opportunity to socialize with others.  \n" +
                        "As per studies, physical activities can also be an outlet for your frustrations, thus, working positively on your mental well-being.  \n" +
                        "Exercise can further decrease skeletal muscle tension, which helps us feel more relaxed. \n" +
                        "To make more room, physical activity improves our cardiovascular health and physical health. This is said to be very important as people with mental health issues are at a higher risk of getting diagnosed with chronic physical conditions such as diabetes, heart disease, arthritis and asthma. \n" +
                        "\n" +
                        "Get Started with Physical Activity and Make a Routine \n Starting and making an exercise routine or we can say continue for your regular physical activity can be a challenge. As a well-reputed and established fitness brand, let us mention some of the steps that can help: \n" +
                        "\n" +
                        "• Find what you enjoy the most- First, you must figure out what type of physical activities or exercise you enjoy the most: Zumba, strength training, running or any other aerobics. This step will help you get the momentum. Doing what you like can help you stick with it.  \n" +
                        "\n" +
                        "• Set reasonable and achievable goals- Think realistically about your goals, you will be able to achieve those. One should start slowly and build up over time. Make your plan according to your requirements and abilities rather than setting goals that you’re not likely to fulfil.  \n" +
                        "\n" +
                        "• Get your healthcare support- It is important to acknowledge your healthcare needs. In between your physical activity, you should talk to your healthcare expert or mental health professional for appropriate advice and support. Talk about your goals, exercise program or your workplace routine.  \n" +
                        "\n" +
                        "• Prepare for setbacks and obstacles- Everyone experiences setbacks while doing anything, be it exercise. One should prepare themselves for any challenge and change them into possibilities. If there’s a day when you are not feeling concentrated, you must try again the next day. Make sure to stick with your plans. \n" +
                        "\n" +
                        "Along with exercise, Yoga is said to be a great way to boost your health and mental well-being. If you are looking to experience the magic of Yoga, one can refer the Yoga for Better & Healthy Living. ",
                "September 30, 2024",
                "There’s no denying the fact that exercise is essential for our physical health and mental well-being. Being physically active is crucial for everyone, be it for kids, adults, or elderly individuals. It is a lifesaver that promotes mental health and well-being"),

            model_class("https://www.anytimefitness.co.in/wp-content/uploads/2024/09/How-Creatine-Transforms-Your-Gym-Results-768x402.jpg",
                "How Creatine Transforms Your Gym Results ?",
                "Creatine is a “legal steroid” that we all have heard of! It is a polarizing topic in the health and fitness industry. Creatine for muscle gain is one of the most researched supplements these days and everyone has some diverse opinions about it. Many people claim that they feel much better after they include creatine in their diets and believe that this supplement helps them get fit and build muscle.  \n" +
                    "\n" +
                    "Generally, creatine is the best to opt for muscle gain. However, we understand that there can be lots of questions regarding creatine transformation. So, let us discuss this vast topic in detail!  \n" +
                    "\n" +
                    "What is Creatine?  \n Creatine is said to be a naturally occurring substance commonly found in meat and fish. Further, it is also made by the human body in the kidneys, liver, and pancreas. Much research shows creatine and muscle growth are companions. It is proven to double your strength and lean muscle gains compared to training alone. Generally, creatine for muscle gain helps you get optimal energy for heavy lifting or high-intensity exercises.  \n" +
                    "\n" +
                    "Let us tell you that there are a few different kinds of creatine available, such as monohydrate, hydrochloride (HCl), and ethyl ester, however, the most talked about is monohydrate.   \n" +
                    "\n" +
                    "Chemically speaking, creatine has many properties like amino acids, which are important compounds in the human body that help build protein.  \n" +
                    "\n" +
                    "It is worth mentioning that about half of your body’s creatine stores come from the food you eat, especially red meat and seafood. The rest is made in your liver and kidneys from amino acids. So, the question that every individual asks- Does creatine help build muscle? The answer is yes, it is a fact that the more creatine we have in our muscles, the more energy we can put into our workout. This is why taking creatine for muscle gain results in better-quality workouts with less fatigue. \n" +
                    "\n" +
                    "How Creatine Works \n When we lift weights, our muscles burn a fuel, known as adenosine triphosphate (ATP). A rep usually fails when someone runs out of that fuel, thus making it difficult to complete the sets. Further, if we rest for a few minutes between sets, our aerobic system can use the air we breathe to refurbish that fuel, giving us the required energy to do another set. \n" +
                    "\n" +
                    "To produce more ATP, one can use creatine for the purpose, creatine for muscle gain allows producing more ATP, giving the muscles more fuel, thus allowing you to pump out an extra rep or two. \n" +
                    "\n" +
                    "Is it Healthy to take Creatine? \n Various studies show that creatine is considered safe for many people. However, there are some cases in which one must take permission, these are:  \n" +
                    "\n" +
                    "Pregnant lady or breastfeeding \n" +
                    "If someone has diabetes. \n" +
                    "Suffering from any kidney or liver disease. \n" +
                    "Further, if anyone has any bipolar disorder, creatine may also increase your risk of mania. \n" +
                    "It is always recommended to talk to a healthcare professional before taking creatine, i.e. you must be sure if it’s safe for you. \n" +
                    "\n" +
                    "Pros of Taking Creatine  \n As we know that creatine and muscle growth go together, studies show that taking creatine may: \n" +
                    "\n" +
                    "Improve an individual’s exercise performance. \n" +
                    "Help in muscle recovery after intense exercise. \n" +
                    "It helps in increasing muscle mass. \n" +
                    "Preventing muscle injuries or we can say reducing the severity of muscle injuries. \n" +
                    "Further, creating helps athletes tolerate intense activities. \n" +
                    "It also reduces dehydration and cramping. \n" +
                    "It helps in reducing muscle tightness, muscle strains or pulls. \n" +
                    "Taking creatine for muscle gain works well for vegetarians, they may see significant muscle gains. It is so because vegetarians don’t get creatine through animal-based sources, it can be a reasonable choice. However, building up creatine levels in your muscles may take longer. \n" +
                    "\n" +
                    "Not only this, but creatine may also benefit in several other ways, such as:  \n" +
                    "\n" +
                    "Neurodegenerative diseases \n" +
                    "Diabetes \n" +
                    "Osteoarthritis \n" +
                    "Conditions that affect creatine metabolism \n" +
                    "Insufficient blood flow to your heart muscle (myocardial ischemia). \n" +
                    "Creatine Intake: Results in your Body \n First, it is unrealistic to assume that creatine for muscle gain shows immediate results, in fact, not a single supplement shows immediate results.  \n" +
                    "\n" +
                    "As per various experiences, one should take a 5-gram scoop of creatine per day, and they can reach full saturation in about 3 weeks. However, the quantity of creatine is something you should decide after proper consideration.   \n" +
                    "\n" +
                    "Now talking about the changes that one can experience are initial spike in weight, it can happen in 7 days. In some cases, one can experience stomach discomfort or hair loss. \n" +
                    "\n" +
                    "If we specifically focus on the results or we can say creatine transformation, one can experience results. These are:  \n" +
                    "\n" +
                    "Increased strengths and ultimately performing more reps after 15 days (about 2 weeks) of creatine intake.  \n" +
                    "\n" +
                    "After a certain period of taking creatine, one can experience better and faster muscle recovery.  \n" +
                    "\n" +
                    "It is not all about creatine and muscle growth, it is a kind of supplement that will also impact cognitive functions, such as improved performance on short-term memory and tests of intelligence. \n" +
                    "\n" +
                    "After a span of 30 days (about 4 and a half weeks), one can experience significant changes in their body, from increased body weight to enhanced workout regime. Nevertheless, the result depends on an individuals’ body and how you are taking creatine. \n" +
                    "\n" +
                    "When To Take Creatine?  \n Many people prefer to take creatine in the morning as it is easy to habit-stack it with breakfast or other supplements. However, one can take it in their pre-workout or have it as a post-workout. It comes to the personal choice ultimately. The most important thing is to be consistent with creatine. Furthermore, it is also proven to take Whey protein or Whey Isolate after an intense workout.  \n" +
                    "\n" +
                    "In conclusion, we can say that creatine can be preferred as a supplement, however, it will be always recommended to consult a healthcare professional.  \n" +
                    "\n" +
                    "Along with this, one should take proper care of their diet and workout regime, and most importantly, the Pre and Post Workout Meal. It is advisable to make proper workout routines as per your goals and stand by it.  \n" +
                    "\n","September 25, 2024","Creatine is a “legal steroid” that we all have heard of! It is a polarizing topic in the health and fitness industry. Creatine for muscle gain is one of the most"),
            model_class("https://www.anytimefitness.co.in/wp-content/uploads/2024/09/The-Complete-Guide-to-Plant-Based-Protein-Benefits-and-Sources-768x402.png","The Complete Guide to Plant-Based Protein: Benefits and Sources ","There is no denying that the world is moving towards environmentally sustainable solutions. One of the concepts that are making its place is veganism, and if we discuss it from the perspective of fitness industry, plant-based protein is getting preferred. What we understand by veganism is the diet which particularly is plant-based. Talking about Veganism, it is a practice that strictly abstains from the use of animal products, including dairy products and eggs. As more and more people are making a shift towards plant-protein, let us talk about this concept in detail!  \n" +
                    "\n" +
                    "But first, let’s get a gist about protein, which is essential for the human body.  \n" +
                    "\n" +
                    "Protein: Essential for the Human Body  \n Protein is essentially found in our body, in muscle, bone, skin, hair, and other tissues. These are essentials that help our body move, carry oxygen to the blood, make enzymes, and much more. If we talk theoretically, protein is made up of amino acids, which are chemical building blocks that are linked to each other in long chains. There are said to be 20 different types of amino acids that can be joined together to make a protein. \n" +
                    "\n" +
                    "In recent years, we have seen people include more protein in their diet, making it healthier for their bodies. It is said to be that protein is necessary for every cell of our body. It helps in nourishing nails, hair, bones, and muscles. Further, protein can also help us feel fuller longer than eating foods without protein. So, it brings a win-win situation for all of us. Some of the food that are rich sources of protein are meat, eggs, and milk, as well as soy and quinoa, which are called complete proteins. On the other hand, there are vegan protein sources available, let’s shed light on those!  \n" +
                    "\n" +
                    "What is Plant-based Protein? \n Plant-based protein is in demand these days, and the reason being is the benefits that it brings. As mentioned, plant protein is a meaningful source of protein usually extracted from plants. Exclusively retrieved from plants, some usual plant-based protein sources are seeds, nuts, tofu, peas, grains, and pulses – which are a large group of plants that give beans (such as pinto, black, and kidney beans), chickpeas, lentils, and split peas. \n" +
                    "\n" +
                    "It is worth mentioning that plant-based protein provides a wealth of essential nutrients than animal-based protein, which are basically meat, poultry, and dairy products. From chickpeas and lentils to quinoa and whole lots of seeds, the diversity of plant-based protein sources is extensive and provides ample opportunities for creating a balanced and nutrient-rich diet. \n" +
                    "\n" +
                    "Opting for plant-based protein is a personal choice as it supports sustainable food production practices. Along with this, it reduces the carbon footprint pertaining to animal agriculture, making it a more environmentally friendly dietary option. Furthermore, there are other benefits of consuming vegan protein sources, let us highlight those!  \n" +
                    "\n" +
                    "Benefits of Plant-based Protein \n Rich in Fiber\n" +
                    "Gluten-free & Allergy-Free\n" +
                    "Muscle Building\n" +
                    "Great Source of Multivitamins\n" +
                    "Prevents Heart Diseases\n" +
                    "Rich in Fiber  \n" +
                    "The universal truth is that plant protein is rich in fiber, which is an amazing help for losing weight, reducing cholesterol level, and even it helps in regulating the sugar level in our body.  \n" +
                    "\n" +
                    "Further, vegan protein powder is something that keeps you fuller for a longer time.   \n" +
                    "\n" +
                    "Gluten-free & Allergy-Free \n" +
                    "Plant-based protein provides various gluten-free and allergy-free options. Some of the gluten-free plant protein sources are brown rice, chia seeds, hemp seeds, etc.  \n" +
                    "\n" +
                    "It has also been noticed that some whey protein powder causes allergies or bloating, however, vegan protein powder is lactose-free, reaction-free, and is most importantly, is a great option for those with diet restrictions.  \n" +
                    "\n" +
                    "Muscle Building  \n" +
                    "One of the exceptional benefits of plant protein is that it helps in promoting muscle thickness. It provides somewhat similar outcomes as whey protein, helping in betterment of performance and body composition. Nonetheless, along with this, muscle building requires proper workout regime. \n" +
                    "\n" +
                    "Great Source of Multivitamins  \n" +
                    "Plant-based protein provides essential multivitamins, usually obtained from soy, pea, and seeds which are rich in vitamins and antioxidants. These are the oxidants that mostly are not found in whey protein. Thus, it can also be considered as a great option for raising the energy level as well as improving skin, hair, and teeth health.  \n" +
                    "\n" +
                    "Prevents Heart Diseases \n" +
                    "Cardiovascular diseases are common these days and have become the leading cause of death globally.  An unhealthy diet that consists of high sodium, processed meats, and fat with little to no vegetables, fruits, and nuts can be risky for the heart. Vegan protein sources can lower the risk of heart disease and are also known to optimize blood pressure, causing a safe effect on the human body.  \n" +
                    "\n" +
                    "Top Plant-Based Protein Sources \n Soy Products\n" +
                    "Legumes\n" +
                    "Nuts and Seeds\n" +
                    "Vegetables with High Protein Content\n" +
                    "Protein-rich Fruits\n" +
                    "Here’s a list of a wide range of plant-based protein that one can consider. The below-mentioned are some of the products that are both nutrient-dense and well-rounded.  \n" +
                    "\n" +
                    "Soy Products (The Complete Protein) \n" +
                    "Tofu \n" +
                    "Textured vegetable protein (TVP) \n" +
                    "Edamame (Beans) \n" +
                    "Soy milk \n" +
                    "2. Legumes \n" +
                    "\n" +
                    "Lentils (black, green, brown) \n" +
                    "Kidney beans \n" +
                    "Chickpeas \n" +
                    "Green peas \n" +
                    "3. Nuts and Seeds \n" +
                    "\n" +
                    "Walnuts \n" +
                    "Almonds \n" +
                    "Range of Seeds (Flax seeds, Chia seeds, Hemp seeds, Pumpkin seeds)  \n" +
                    "Peanut, almond butter \n" +
                    "4. Vegetables with High Protein Content  \n" +
                    "\n" +
                    "Spinach \n" +
                    "Broccoli \n" +
                    "Brussel sprouts \n" +
                    "Asparagus \n" +
                    "5. Protein-rich Fruits  \n" +
                    "\n" +
                    "Bananas  \n" +
                    "Avocado  \n" +
                    "Guava  \n" +
                    "Dates  \n" +
                    "Jackfruit, etc. \n" +
                    "It is great to mention that plant-based proteins as well as whey are equally beneficial, and it all comes down to personal choice. The best choice solely depends on your dietary requirements & limitations. The major difference lies between the two is that whey protein might have all the necessary amino, but it is not perfect for everybody. On the other hand, a plant-based diet is an amazing option with additional health benefits. Furthermore, if you are someone who wants to know all about the necessary details about Whey protein, you can check the detailed analysis of Whey Protein!  \n" +
                    "\n" +
                    "Incorporating more plant protein in your diet is a win for your body and our planet’s health. What you must do is better planning and must keep an open mind to try new things, it will allow you to cherish multiple vegan protein sources. \n" +
                    "\n" +
                    "Helpful Tips to Transition to Plant-protein Diet  \n First, it is important to start slowly as it can get overwhelming. Including plant-based protein gradually, it can be initiated by swapping animal-based protein with beans, tofu, and lentils. With time, it will become your habit.  \n" +
                    "\n" +
                    "Plan your meal in advance, it will ensure a proper healthy meal. Make sure to incorporate a balanced amount of protein in your diet, it will ensure of adequate amount of protein.  \n" +
                    "\n" +
                    "It is common to have cravings for animal-based protein or at times, you can feel that you have limited options. The only way to overcome this is to keep yourself satisfied or we can say full of plant-based protein. Not only this, but we must also keep our gut health in a safe shape, so make sure to take proper care of that. Check out the detailed summary of Gut Health and the Food that we can intake to make sure of its health",
                "September 21, 2024","There is no denying that the world is moving towards environmentally sustainable solutions. One of the concepts that are making its place is veganism, and if we discuss it from"),
//            model_class("","","",""),
//            model_class("","","",""),
//            model_class("","","",""),

        )
        adaptor = BlogAdapter(blogList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adaptor
    }

}