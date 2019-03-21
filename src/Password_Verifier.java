public class Password_Verifier{

    public static boolean validPassword(String password)
    {
        int passwordLength = 6;
        boolean itWorks = false;

        if(password.length() >= passwordLength && hasUpperCase(password)
                && hasLowerCase(password) && hasDigit(password))
            itWorks = true;
        else
            itWorks = false;

        return itWorks;
    }

    private static boolean hasUpperCase(String password)
    {
        boolean itWorks = false;

        int i = 0;
        while (i < password.length()){
            if(Character.isUpperCase(password.charAt(i)))
            {
                itWorks = true;
                break;
            }
            i++;
        }
        return itWorks;
    }

    private static boolean hasLowerCase(String password)
    {
        boolean itWorks = false;

        int i = 0;
        while (i < password.length()){
            if(Character.isLowerCase(password.charAt(i)))
            {
                itWorks = true;
                break;
            }
            i++;
        }
        return itWorks;
    }

    private static boolean hasDigit(String password)
    {
        boolean itWorks = false;
        int i = 0;

        while(i < password.length())
        {
            if ((Character.isDigit(password.charAt(i))))
            {
                itWorks = true;
                break;
            }
            i++;
        }
        return itWorks;
    }

}
