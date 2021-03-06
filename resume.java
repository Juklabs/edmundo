import greenfoot.*;
public class resume extends pause
{
    private boolean mouseOver = false;
    GreenfootSound SFX = new GreenfootSound("sfx/button_hover.mp3"); 
    GreenfootSound SFX2 = new GreenfootSound("sfx/button_click.mp3");
    public void act()
    {
       setLocation(585, 118);
       MouseInfo mouse = Greenfoot.getMouseInfo();
       pause p = new pause();
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            SFX.play();
            setImage("gui/pause/resume_hover.png");  
            mouseOver = true;  
            HandCursor.setImage(); 
         }  
       if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("gui/pause/resume.png");  
             mouseOver = false;  
             MouseCursor.setImage(); 
         } 
       if (Greenfoot.mouseClicked(this))  
        {  
            SFX2.play();
            getWorld().removeObjects(getWorld().getObjects(pause.class));
            p.setPaused(false);
        }   
    }     
}
