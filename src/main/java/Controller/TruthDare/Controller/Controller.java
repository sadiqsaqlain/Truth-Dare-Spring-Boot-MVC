package Controller.TruthDare.Controller;

import java.util.Random;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/reshuf")
	public String res(@RequestParam String naams[],ModelMap m)
	{
		Random r=new Random();
		int ss=naams.length;
		m.put("nam", naams[r.nextInt(ss)]);
		m.put("names", naams);
		return "view";
		
	}
	
	@GetMapping("/num")
	public String num(@RequestParam int num,ModelMap m)
	{
		m.put("num", num);
		return "names";
	}
	
	@GetMapping("/namelist")
	public String names(@RequestParam String name[],ModelMap m)
	{
	
		Random r=new Random();
		int ss=name.length;
		m.put("nam", name[r.nextInt(ss)]);
		m.put("names", name);
		return "view";
		
	}
	@GetMapping("/tdin")
	public String td(@RequestParam String t,ModelMap m,@RequestParam String naam,@RequestParam String naams[])
	{
//		System.out.println(naam);
//		
//		System.out.println(Arrays.toString(naams));
		String a="";
		
		if(t.equals("t"))
		{
			String name=naam;
			//System.out.println(t+" truth");
			String aa="Are you scared of getting old?  At what age did you first taste alcohol? At what age did you lose your virginity? Boxers or briefs? Do you believe in aliens? Do you believe in any superstitions? If so, which ones? Do you believe in soul mates? Do you have a favorite child? Do you have a work spouse? Do you have any fetishes? Do you have any hidden talents,What are they? Do you pee in the shower? Do you secretly dislike any of your friends’ kids? Do you still have feelings for any of your exes? Do you think cheating can ever be justified,How? Has anyone ever walked in on you in the bathroom? Have you ever been arrested? Have you ever been caught doing something you shouldn’t have?Have you ever been fired from a job? Have you ever been in a fight? Have you ever been kicked out of a public place? Have you ever been nude in public? Have you ever broken an expensive item? Have you ever broken someone’s heart? Have you ever broken the law? Have you ever cheated on an exam? Have you ever cheated on someone? Have you ever compromised your morals for money? How? Have you ever considered cheating on a partner? Have you ever dated someone just for sex? Have you ever dated your boss? Have you ever ditched someone on a date? Have you ever faked sick to get out of a party? Have you ever farted and blamed it on someone else? Have you ever farted in an elevator?    Have you ever flirted with a close friend’s sibling?    Have you ever ghosted a friend?    Have you ever gone skinny dipping?    Have you ever gotten mad at a friend for posting an unflattering picture of you?    Have you ever had a crush on a boss or teacher?     Have you ever had a crush on a co-worker?    Have you ever had a crush on someone’s parents?    Have you ever had a near-death experience?    Have you ever had a one-night stand?    Have you ever had a one-night stand?    Have you ever had a paranormal experience?     Have you ever had a run in with the law?    Have you ever had a wardrobe malfunction?     Have you ever had an imaginary friend Describe them?    Have you ever had your fortune told?    Have you ever intentionally sabotaged a co-worker?    Have you ever let someone take the blame for something you did?    Have you ever lied about your age?    Have you ever lied for a friend?    Have you ever lied on your resume?    Have you ever lied to get out of a bad date?    Have you ever lied to your boss?    Have you ever made out with someone for revenge?    Have you ever peed in a pool?    Have you ever picked your nose in public?    Have you ever pooped your pants as an adult?    Have you ever pretended to not get a text to get out of doing something?    Have you ever re-gifted a present?      Have you ever reported someone to an authority for doing something wrong?    Have you ever revealed a friend’s secret to someone else?    Have you ever said, “I love you” and not really meant it To whom?    Have you ever seen a dead body?    Have you ever sent a sext to the wrong person, Who?    Have you ever sent nude photos?    Have you ever stolen anything?    Have you ever stolen something from work?    Have you ever thought of cheating on your partner?    Have you ever thrown up in public?    Have you ever used a fake ID?    How long have you had your oldest pair of underwear?    How long was your longest relationship?    How many gossip blogs do you read a day?     How many kids did (or do) you want to have?    How many people have you kissed?    How many people have you slept with?    How many secret admirers do you think you have in real life?    How many selfies do you take a day?    How many stuffed animals do you own?     How many times a week do you wear the same pants?    How many times do you wear your jeans before you wash them?    How often do you wash your sheets?    If a genie granted you three wishes, what would you ask for?    If I went through your cabinets, what’s the weirdest thing I’d find?    If someone went through your closet, what is the weirdest thing they’d find?    If you could be a fictional character for a day, who would you choose?    If you could be invisible, what’s the first thing you would do?    If you could date two people at once, would you do it If so, who?    If you could have a celebrity for a best friend, who would it be?    If you could hire someone to do one thing for you, what would it be?    If you could make a sex tape what would be the plot?    If you could only accomplish three things in life, what would they be?    If you could only have one app on your phone what would it be?    If you could set anyone here up with your best friend, who would it be and why?    If you could trade lives with any person you know for a day, who would it be?    If you could travel to the past and meet one person, who would it be?    If you had one week to live and you had to marry someone in this room, who would it be?    If you had the choice to never have to sleep again, would you take it?    If you had to always be overdressed or underdressed, which would you choose?    If you had to change your name, what would your new first name be?    If you had to get a tattoo today, what would it be?     If you had to move to a different country tomorrow, where would you go?    If you had to only ever watch one genre of movies for the rest of your life, which would you choose?    If you had to pick someone in this room to be your partner on a game show, who would it be and why?    If you had to wear only flip flops or heels for the next  years, which would you choose?    If you met a genie, what would your three wishes be?    If you suddenly had a million dollars, how would you spend it?    If your house caught on fire and you could only save three things (besides people), what would they be?    Is there an ex with whom you’d consider reconciling?    Is there anyone in your life who you are jealous of?    Name one thing you’d change about every person in this room?    Name one thing you’d do if you knew there’d be zero consequences?    Name someone you’ve pretended to like but actually couldn’t stand?    Name your go-to karaoke song?    Personality-wise, are you more like your mom or your dad?    Reveal all the details of your first kiss?    Tell us about the worst date you’ve ever been on?    What animal do you think you most look like?    What app do you waste the most time on?    What are the top three things you look for in a love interest?    What are you most proud of in your life?    What are your favorite and least favorite of your body parts?    What are your thoughts on polyamory?    What bridges are you glad that you burned?    What celebrity do you think is overrated?    What do you think happens when you die?    What do you want on your tombstone?    What do you want to be remembered for most in life?    What do your favorite pajamas look like?    What excuse have you used before to get out plans?    What five things would you bring to a deserted island?    What is a secret you had as a child that you never told your parents?    What is a weird food that you love?    What is one thing you would stand in line an hour for?    What is one thing you’d change about your appearance if you could?    What is something you would do if you knew there were no consequences?    What is that one thing you would never do for all the money in the world?    What is the biggest fight you’ve ever been in with a friend?    What is the biggest lie you’ve ever told?    What is the craziest pickup line you’ve ever used?     What is the dirtiest room/area of your house?    What is the last text message you sent your best friend?    What is the longest you’ve ever gone without showering?    What is the most embarrassing thing you’ve posted on social media?    What is the most number of times you had sex in one day?    What is the weirdest thing you’ve ever done in public?    What is the worst date you’ve ever been on?    What is the worst food you’ve ever tasted?    What is the worst grade you received for a class in school/college?    What is the worst physical pain you’ve ever been in?    What is the youngest age partner you’d date?    What is your biggest insecurity?    What is your greatest fear in a relationship?    What is your most favorite memory of sex?    What is your worst habit?    What song do you sing most in the shower?    What terrible movie or show is your guilty pleasure?    What unexpected part of the body do you find attractive?    What was the most embarrassing thing you’ve ever done on a date?    What was your biggest childhood fear?    What was your first concert?      What was your first heartbreak?    What’s a secret you’ve never told anyone?    What’s best for you, a love marriage, marriage for money or arranged marriage?    What’s one silly thing you can’t live without?    What’s something you would never do, even for $ million?    What’s something you’re glad your mom doesn’t know about you?    What’s the biggest mistake you’ve ever made?    What’s the longest amount of time you left food on the floor before eating it?    What’s the longest you’ve ever slept?    What’s the most disgusting thing you’ve ever done?    What’s the most drunk you’ve ever been?    What’s the most embarrassing thing you ever did on a date?    What’s the most embarrassing top-played song on your phone?    What’s the most trouble you’ve been in?    What’s the strangest dream you’ve had?    What’s the weirdest thing you’ve ever eaten?    What’s the worst intimate experience you’ve ever had?    What’s the worst thing anyone’s ever done to you?    What’s the worst thing you’ve ever done?    What’s the worst thing you’ve ever said to anyone?    What’s your biggest fantasy?    What’s your biggest fear?    What’s your favorite part of your body?    What’s an instant deal breaker in a potential love interest?    What’s been your most physically painful experience?    What’s one job you could never do?    What’s one thing about your partner that you find least attractive?    What’s one thing in your life you wish you could change?    What’s one thing you wish you could change about yourself?    What’s one useless skill you’d love to learn anyway?    What’s something you know you need to do but aren’t looking forward to at all?    What’s something you only do when you’re alone?    What’s something you’re embarrassed that you’re good at?    What’s something you’ve done that you still feel guilty about?    What’s the biggest prank you’ve ever played on someone?    What’s the cheapest gift you’ve ever gotten for someone else?    What’s the craziest thing you’ve done to get out of a speeding ticket?    What’s the craziest thing you’ve ever done in a movie theater?    What’s the cruelest thing you’ve ever done or said to a romantic partner?    What’s the dumbest thing you’ve ever lied about?    What’s the grossest thing that you do alone?    What’s the hardest drug you’ve ever tried?    What’s the last lie you told?    What’s the last movie that made you cry?    What’s the last thing you Googled?    What’s the longest you’ve gone without brushing your teeth?   What’s the meanest thing you’ve ever said to someone else?    What’s the most adventurous thing you’ve ever done?    What’s the most bogus rumor you’ve ever heard about yourself?    What’s the most common misconception about you?    What’s the most embarrassing nickname you’ve ever been given?    What’s the most embarrassing text in your phone right now?    What’s the most food you’ve ever eaten in a single sitting?    What’s the most inappropriate time you’ve ever laughed?    What’s the most offensive joke you’ve found funny?    What’s the most random thing in your bag right now?    What’s the most ridiculous thing you have an emotional attachment to?    What’s the most scandalous photo in your cloud?    What’s the scariest thing that’s ever happened to you?    What’s the scariest thing you’ve ever done?    What’s the smallest tip you’ve ever left at a restaurant?    What’s the weirdest place you’ve ever given or gotten someone’s number?    What’s the weirdest place you’ve ever grown hair?    What’s the weirdest thing you do while driving?    What’s the weirdest thing you’ve done on a plane?    What’s the weirdest thing you’ve ever done in a bathroom?    What’s the weirdest thought you’ve had sitting on a toilet?    What’s the worst present someone has ever given you?    What’s the worst thing you’ve ever done at work?    What’s your biggest insecurity?    What’s your biggest pet peeve about the person to your left?    What’s your biggest regret?    What’s your favorite possession?    What’s your most absurd deal breaker for a partner?    What’s your most embarrassing grooming habit?    What’s your most embarrassing late night purchase?    What’s your worst memory from high school?    When and where was your first kiss, Who was it with?    When is the last time you cried?    When is the last time you did something technically illegal?    When is the last time you made someone else cry?    When was the last time you faked an orgasm and why?    When was the last time you lied?    When was the last time you were really angry, Why?    When’s the last time you apologized, What for?    When’s the last time you dumped someone?    When’s the last time you got rejected?    When’s the last time you lurked an ex on social media?    When’s the last time you peed your pants?    When’s the last time you shared a toothbrush with someone else?    When’s the last time you watched an adult movie?    When’s the last time your partner embarrassed you?    Where do most of your embarrassing odors come from?    Where is the weirdest place you’ve ever gone to the bathroom?    Where’s the weirdest place you’ve had sex?    Which of your family members annoys you the most and why?    Which one person here would survive a zombie apocalypse and which would be the first to go?    Who are you most jealous of?    Who do you fantasize the most about?    Who do you most often text on the toilet?    Who do you think is the hottest person in your family?    Who in this group would you want to swap lives with for a week?    Who in this room do you trust the least?    Who in this room would be your one phone call if you were in jail?    Who is the best kisser you’ve ever had?    Who is the last person you creeped on social media?    Who is your secret crush?    Who was your first?    Who was your worst kiss ever?    Who would you bring with you on a deserted island?    Who would you call to help bury a body?    Who would you hate to see naked?    Who would you like to kiss in this room?    Who’s the most surprising person to ever slide into your DMs?    Who’s the oldest person you’ve dated?    Who’s the person you most regret hooking up with?    Who’s your hall pass?    Would you break up with your partner for $ million?    Would you date someone shorter than you?    Would you date your high school crush today?    Would you ever consider being a nudist?    Would you ever get a prenup?    Would you ever get plastic surgery?    Would you marry someone rich even if you weren’t in love with them";
			String b[]=aa.split("\\?");
			Random r=new Random();
			m.put("trut",b[r.nextInt(b.length)]);
			m.put("naam",name);
			m.put("names", naams);
			a="truth";
		}
		else if(t.equals("d"))
		{
			String aa="Take an embarrassing selfie and post it as your profile picture. Remove your socks with your teeth. Go next door with a measuring cup and ask for a cup of sugar. Let the group choose an item for you to brush your teeth with. Write your name on the floor with your tongue. Stick a Hot Cheeto in your nose, and leave it there for five minutes. Open your front door and howl like a wolf for 30 seconds. Let the person to your right put duct tape on any part of your body they choose and rip it off. Put a bunch of honey on your nose and coat it with flour. Until the next round, talk super loud, like nobody can hear you. Call your crush. Take a shot of pickle juice. Talk to a pillow like it’s your crush. Pretend you’re a bird and eat cereal off the floor using only your mouth. Make out with your hand. Let someone else style your hair and keep it that way for the rest of the day. Use a brush like you’re talking into a microphone each time you speak. Color one of your front teeth black. (Eyeliner works!) Pick your friend’s nose. Fake cry. Make repulsive sounds while eating and drinking. Cross your eyes when talking. Talk without closing your mouth. Act like an animal of the group’s choosing. Get into a debate with a wall. Squirt your face with a squirt gun continuously while talking. See how many grapes you can stuff in your mouth. Hiccup in between each word. Burp the alphabet. Draw on your face with permanent marker. Dip your sock-covered feet in the toilet, and don't dry them off for the rest of the game. Eat a spoonful of mustard. Lift up the couch cushions, and if there is anything under them, you need to put it in your mouth for 10 seconds. Spin around 10 times and try to walk straight. Eat a raw egg. Let the group choose three random things from the refrigerator and mix them together. Then you have to eat the mixture. Stand up and do jumping jacks until your next turn. Rub your armpits and then smell your fingers. Dig through the trash and name everything you find.  Go on Facebook Live and read the back of a shampoo bottle. Call a 7-Eleven and ask if they’re open. Stand in the backyard and yell at the top of your lungs, “Nooooo! I was adopted!” Go outside in the driveway and do the disco without music. Call a car part store and tell them that you need a part for your Model T. Take a selfie with the toilet and post it online. Sniff everyone’s feet and rank them in order of freshest to stinkiest. Call a NY-style pizza place and ask them what the difference is between NY pizza and “real” pizza. Open your front door and loudly sing “Hallelujah!” Go outside and pretend you're cutting the grass with an invisible mower. Call a pizza place and ask if they use cruelty-free wheat in their dough. Call your mom and tell her you can't find a girlfriend in a very panicked voice. Wear your underwear over your pants for the rest of the game. Call the library and ask if they carry a dictionary that translates British to American. Send a Snapchat of you pretending to cry because you just found out you were adopted. Go on Facebook and write How do you spell facebook? as your status. Sniff the armpit of the person next to you, and describe what it smells like to the entire group. Go outside and try to summon the rain. Sing the 'Star-Spangled Banner' in a British accent. Take a picture of a tampon and post it on Instagram. Call a random number, and when someone picks up, immediately start singing the national anthem. Call Target and ask them if they deliver popcorn. Call McDonald's and ask if they sell Whoppers. Call a pizza shop and ask if you can return a pizza. Call a car dealership and ask if they have any horse buggies in stock. Change your relationship status on Facebook to 'it's complicated'. Call Macy's and tell them you're interested in buying them. Sing instead of speaking for the next two rounds of the game. Call a random number and sing 'Happy Birthday'. Call a Chinese restaurant and ask if they have sushi.  Go outside and pick exactly 40 blades of grass with a pair of tweezers. Eat a whole piece of paper. Fill your mouth with water, and each person in the group must tell the funniest joke they know. If you spit up the water, you have to eat a spoonful of dirt. Tie your hands to your ankles for the rest of the game. Suck your big toe. Eat a mouthful of raw pasta. Dump a bunch of LEGOs on the floor and walk over them with your bare feet. Write a letter to your doctor describing an embarrassing rash you have, and post it on Facebook. Go outside and hug a mailbox until at least three passersby have seen you. Only speak in rhymes for the rest of the game. Soak a shirt in water, put it in the fridge for 20 minutes, and then wear it. Trade clothes with the person next to you. Make a silly face and keep it that way until the next round. Kneel for an hour. Let someone wax your back. Drink water straight from a running faucet for a whole minute. For the rest of the game, do not say 'I'. Make up a rap about koalas. Call a stranger and tell them a secret. Allow someone to pour ice down your shirt and pants. Let each person in the group slap you as hard as they can on your butt. Walk down the street in your underwear. Make your ear touch your shoulder for the rest of the game. Run around outside yelling, “I have lice!” Stop a car that is going down the street and tell them that their wheels are turning. Open Facebook, go to the account of the first person you see, and Like every post on their wall going back a full year. Pick the nose of the person next to you. Lick a car tire. Lick the bottom of your shoe. Jump into a dumpster. Take a plate of leftovers over to your neighbor, knock on their door, and say, 'Welcome to the neighborhood' as if you've never met them before. Make a hand puppet by drawing a face on your hand, and use your hand to say what you want to say. Let everyone look through your search history for two minutes. Coat your hands in food coloring, and don’t wash them off for 10 minutes. Skype/FaceTime someone and pick your nose during the conversation. Remove your underwear and throw it in the garbage. Lick mayonnaise off of someone's toe. Let a person in the group put a leash on you and walk you down the street. Cry like a baby for one full minute. Call a drugstore and ask them which laxative is the most effective. After they answer, ask how many they have.  Give yourself a 10-second manicure. Every nail must be painted. Brush the teeth of the person sitting next to you. Text your crush and tell them you love them. Call a random number and try to flirt with the person who picks up. Stuff ice inside your bra and leave it there for 60 seconds. Let everyone rummage through your purse. Post a really long and serious Facebook status confessing your love for chocolate. Take your bra off under your shirt, and don't put it back on until the end of the game. Do 10 push-ups. Run around the house with a pair of underwear on your head. Use three items in the fridge as lotion. Let the person to your left do your makeup. Call a guy of the group's choosing and tell him he's the ugliest person you've ever met. Lick a doorknob. Be blindfolded for the rest of the game. Let each person in the group crack an egg on your head. Sing everything you say for the rest of the game. Twerk to an NSYNC song. Dip a toothbrush into the toilet water and brush your teeth with it. Let people throw food at you. Rub mayonnaise in your hair and leave it on for the rest of the game. Blindfold someone and have them kiss three objects.  Get on your knees and walk like that until the end of the game. Silently do the macarena. Give yourself a permanent marker mustache. Shave one of your arms. Hold your nose while talking. Give everyone in the room a hug. Do as many squats as you can. On the front lawn. Go outside and hug a tree. Sing the “I Love You” Barney song. Eat an ant. Attempt to breakdance. Do the worm. Have a full conversation with yourself in a mirror. Put your shoes on the wrong feet and keep them there. Do a hula dance. Lick the wall. Sing like an opera singer. Wear your underwear on the outside of your clothes. Sing the chorus of your favorite song. For the next 15 minutes, only speak in baby talk. Put hot sauce on ice cream and eat it. Admit on Facebook that you still wear a training bra. Let someone in the group cut a piece of your hair. Do 50 sit-ups. Call Walmart and ask if they do makeovers for prom. Call a tattoo shop and ask if they can tattoo 30 teardrops on your face. Run down the street with a wet T-shirt on. Move across the floor using only your hands. Film a makeup tutorial and post it to Facebook. Tweet or update your Facebook status to 'I think eggplants are sexy'. Text 6th one on your call list and text them hi and respond them only hi 10 times and 11th time tell them bye and dont reply.";
			String b[]=aa.split("\\.");
			Random r=new Random();
			m.put("dare",b[r.nextInt(b.length)]);
			m.put("name", naam);
			m.put("names", naams);
			//System.out.println(t+" dare");
			a="dare";
		}
		return a;
	}	
}